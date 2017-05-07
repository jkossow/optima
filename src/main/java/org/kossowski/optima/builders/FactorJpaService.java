package org.kossowski.optima.builders;

import org.kossowski.domain.AdresZamieszkaniaFactorDB;
import org.kossowski.domain.Path1;
import org.kossowski.domain.Path2;
import org.kossowski.domain.Path3;
import org.kossowski.optima.AppOptima;
import org.kossowski.optima.FactorAppOptima;
import org.kossowski.optima.app.WnioskodawcaApp;
import org.kossowski.optima.converters.AdresZamieszkaniaComverter;
import org.kossowski.optima.converters.StanCywilnyConverter;
import org.kossowski.repo.Path1Repository;
import org.kossowski.repo.Path2Repository;
import org.kossowski.repo.Path3Repository;
import org.kossowski.repo.StatusWnioskuRepository;
import org.kossowski.repo.WniosekRepository;
import org.kossowski.repo.WnioskodawcaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class FactorJpaService {
	
	private Logger log = LoggerFactory.getLogger( this.getClass() );
	
	@Autowired
	protected StatusWnioskuRepository statusRepo;
	
	@Autowired
	protected WniosekRepository wniosekRepo;
	
	@Autowired
	protected WnioskodawcaRepository wnioskodawcaRepo;
	
	@Autowired
	protected Path1Repository path1Repo;
	
	@Autowired
	protected Path2Repository path2Repo;
	
	@Autowired
	protected Path3Repository path3Repo;
	
	// metody pack*  app -> ctx
	// metody unpack ctx -> app
	
	
	//public void save( AppOptima app ) {
	//	
	//	FactorDatabaseContext ctx = new FactorDatabaseContext();
	//	ctx = pack( app );
	//	
	//	wnioskodawcaRepo.save( ctx.getWnioskodawca() );
	//	ctx.getWniosek().setWnioskodawcaId( ctx.getWnioskodawca().getId() );
	//	//korekta statusu - dla nowego wniosku
	//			if( ctx.getWniosek().getStatusWniosku() == null )
	//				ctx.getWniosek().setStatusWniosku( statusRepo.getInitialStatus() );
	//	wniosekRepo.save( ctx.getWniosek() );
	//	
	//	
	//}
	
	public void save( FactorDatabaseContext ctx ) {
		
		log.info( ctx.getWniosek().toString() );
		log.info( ctx.getWnioskodawca().toString() );
		log.info("Wnioskodawca id przed zapisem =" + ctx.getWnioskodawca().getId() );
		wnioskodawcaRepo.save( ctx.getWnioskodawca() );
		log.info("Wnioskodawca id po zapisie =" + ctx.getWnioskodawca().getId() );
		// więzy integralności
		
		ctx.getWniosek().setWnioskodawcaId( ctx.getWnioskodawca().getId() );
		//korekta statusu - dla nowego wniosku
		if( ctx.getWniosek().getStatusWniosku() == null )
			ctx.getWniosek().setStatusWniosku( statusRepo.getInitialStatus() );
		wniosekRepo.save( ctx.getWniosek() );
		
		log.info("Po zapisie");
		log.info( ctx.getWniosek().toString() );
		log.info( ctx.getWnioskodawca().toString() );
		
		Integer wniosekId = ctx.getWniosek().getId();
		Integer wnioskodawcaId = ctx.getWnioskodawca().getId();
		
		ctx.getPath1().setIdWniosku( wniosekId );
		ctx.getPath1().setIdWnioskodawcy( wnioskodawcaId );
		path1Repo.save( ctx.getPath1() );
		
		ctx.getPath2().setIdWniosku( wniosekId );
		ctx.getPath2().setIdWnioskodawcy( wnioskodawcaId );
		path2Repo.save( ctx.getPath2() );
		
		ctx.getPath3().setIdWniosku( wniosekId );
		ctx.getPath3().setIdWnioskodawcy( wnioskodawcaId );
		path3Repo.save( ctx.getPath3() );
		
		log.info("Wszystko zapisane");
		
		
		
	}
	
	public FactorDatabaseContext find( Integer id) {
		
		FactorDatabaseContext ctx = new FactorDatabaseContext();
		ctx.setId(id);
		ctx.setWniosek(  wniosekRepo.findOne( id) );
		ctx.setWnioskodawca( wnioskodawcaRepo.findOne( ctx.getWniosek().getWnioskodawcaId() ));
		log.info( "Adres zameldowania po find-> " + ctx.getWnioskodawca().getAdresZameldowania() );
		log.info( "War obsl ośwoadczenie find-> " + ctx.getWnioskodawca().getOswiadczenieWarunkiObslugi() );
		log.info("Metoda find id=" + ctx.getWniosek().getId() );
		log.info( ctx.getWniosek().toString() );
		log.info( ctx.getWnioskodawca().toString() );
		
		ctx.setPath1( path1Repo.findByIdWniosku(id));
		if( ctx.getPath1() == null )
			ctx.setPath1( new Path1() );
		
		ctx.setPath2( path2Repo.findByIdWniosku(id));
		if( ctx.getPath2() == null )
			ctx.setPath2( new Path2() );
		
		ctx.setPath3( path3Repo.findByIdWniosku(id));
		if( ctx.getPath3() == null )
			ctx.setPath3( new Path3() );
		
		
		return ctx;
		
	}
	
	

	
	public FactorDatabaseContext pack( AppOptima app ) {
		
		FactorDatabaseContext ctx = new FactorDatabaseContext();
		
		ctx.getWniosek().setId( app.getNaglowek().getWniosek().getId() );
		ctx.getWniosek().setOptimaTyp( app.getNaglowek().getWniosek().getRodzaj() );
		ctx.getWniosek().setOptimaRodzaj( app.getNaglowek().getWniosek().getTyp() );
		//TODO: wypelnic dla pełnego wniosku
		// miejsce podpisania
		// data podpisania
		// wniosek sporzadzil
		//zrodlo informacji
		ctx.getWniosek().setKwotaKredytu( app.getDane().getKwota() );
		ctx.getWniosek().setIloscRat( app.getDane().getOkres() ); //ilosc rat
		
		ctx.getWnioskodawca().setPesel( app.getNaglowek().getWnioskodawca().getPesel());
		ctx.getWnioskodawca().setNazwisko( app.getNaglowek().getWnioskodawca().getNazwisko() );
		ctx.getWnioskodawca().setImie( app.getNaglowek().getWnioskodawca().getImie() );
		
		WnioskodawcaApp wnioskodawcaApp = app.getDane().getWnioskodawcy().get( 0 );
		ctx.getWnioskodawca().setId( wnioskodawcaApp.getId() );
		
		ctx.getWnioskodawca().setSeriaNrDowodu( wnioskodawcaApp.getDowodOsobisty() );
		
		ctx.getWnioskodawca().setStanCywilny(  new StanCywilnyConverter().toFactor(  wnioskodawcaApp.getStanCywilny()  ));
		ctx.getWnioskodawca().setIleOsobWRodzinie( wnioskodawcaApp.getIleOsobWRodzinie() );
		
		AdresZamieszkaniaFactorDB  adresZamieszk = new AdresZamieszkaniaFactorDB( wnioskodawcaApp.getAdresZamieszkania() );
		ctx.getWnioskodawca().setAdresZamieszkania( adresZamieszk );
		
		//ctx.getWnioskodawca().setRodzajDochodu( wnioskodawcaApp.getD);
		
		return ctx;
	}
	
	public AppOptima unpack( FactorDatabaseContext ctx) {
		
		AppOptima app = FactorAppOptima.getNewPrescoring();
		
		app.getNaglowek().getWniosek().setId(  ctx.getWniosek().getId() );
		app.getNaglowek().getWniosek().setRodzaj( ctx.getWniosek().getOptimaRodzaj() );
		app.getNaglowek().getWniosek().setTyp( ctx.getWniosek().getOptimaTyp()  );
		
		app.getDane().setKwota( ctx.getWniosek().getKwotaKredytu() );
		app.getDane().setOkres( ctx.getWniosek().getIloscRat() );
		
		app.getNaglowek().getWnioskodawca().setPesel( ctx.getWnioskodawca().getPesel() );
		app.getNaglowek().getWnioskodawca().setNazwisko( ctx.getWnioskodawca().getNazwisko() );
		app.getNaglowek().getWnioskodawca().setImie( ctx.getWnioskodawca().getImie() );
		//TODO: wypelnic dla pełnego wniosku
				// miejsce podpisania
				// data podpisania
				// wniosek sporzadzil
				//zrodlo informacji
		
		WnioskodawcaApp wnioskodawca = new WnioskodawcaApp();
		wnioskodawca.setId( ctx.getWnioskodawca().getId() );
		wnioskodawca.setDowodOsobisty( ctx.getWnioskodawca().getSeriaNrDowodu() );
		//TODO: dodać konwerter
		wnioskodawca.setStanCywilny(  new StanCywilnyConverter().fromFactor( ctx.getWnioskodawca().getStanCywilny() ));
		wnioskodawca.setIleOsobWRodzinie( ctx.getWnioskodawca().getIleOsobWRodzinie());
		wnioskodawca.addAddress( AdresZamieszkaniaComverter.fromFactor( ctx.getWnioskodawca().getAdresZamieszkania() ));
		
		app.getDane().addWnioskodawcaApp( wnioskodawca);
		
		return app;
		
	}
	
	
}
