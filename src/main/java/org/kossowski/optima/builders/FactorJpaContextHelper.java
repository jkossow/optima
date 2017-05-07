package org.kossowski.optima.builders;

import org.kossowski.domain.Wniosek;
import org.kossowski.repo.Path1Repository;
import org.kossowski.repo.Path2Repository;
import org.kossowski.repo.Path3Repository;
import org.kossowski.repo.WniosekRepository;
import org.kossowski.repo.WnioskodawcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FactorJpaContextHelper {

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
	
	//@Autowired
	//protected BankRepository bankRepo;
	
	//@Autowired
	//protected RodzajDochoduRepository rodzajDochoduRepo;
	
	//@Autowired
	//protected RozdzielnoscMajatkowaRepository rozdzielnoscMajatkowaRepo;
	
	//@Autowired 
	//protected SkanWnioskuRepository skanWnioskuRepo;
	
	//@Autowired
	//protected TelefonRozliczenieRepository telefonRozliczenieRepo;
	
	//@Autowired
	//protected WojskoRepository wojskoRepo;
	
	//@Autowired
	//protected WyksztalcenieRepository wyksztalcenieRepo;
	
	//@Autowired
	//protected WojewodztwoRepository wojewodztwoRepo;
	
	public FactorJpaContextHelper() {};
	

	public FactorDatabaseContext getCtx( Integer wniosekId ) {
		FactorDatabaseContext ctx = new FactorDatabaseContext();
		//ctx.setId( wniosekId );
		ustawSlowniki( wniosekId, ctx );
		return ctx;
	}
	
	private void ustawSlowniki( Integer wniosekId, FactorDatabaseContext ctx ) {
		
		Wniosek w = wniosekRepo.findOne( wniosekId );
		ctx.setWniosek( w );
		ctx.setWnioskodawca( wnioskodawcaRepo.findOne(  w.getWnioskodawcaId() ));
		ctx.setPath1( path1Repo.findByIdWnioskodawcy( w.getWnioskodawcaId() ));
		ctx.setPath2( path2Repo.findByIdWnioskodawcy( w.getWnioskodawcaId() ));
		ctx.setPath3( path3Repo.findByIdWnioskodawcy( w.getWnioskodawcaId() ));
		
		//ctx.setBank( bankRepo.findOne( wniosekId ));
		//ctx.setRodzajDochodu( rodzajDochoduRepo.findOne( wniosekId ));
		//ctx.setRozdzielnoscMajatkowa( rozdzielnoscMajatkowaRepo.findOne( wniosekId ));
		//ctx.setSkanWniosku( skanWnioskuRepo.findOne( wniosekId ));
		//ctx.setTelefonRozliczenie( telefonRozliczenieRepo.findOne( wniosekId ));
		//ctx.setWojsko( wojskoRepo.findOne( wniosekId ));
		//ctx.setWyksztalcenie( wyksztalcenieRepo.findOne( wniosekId ));
		//ctx.setWojewodztwo( wojewodztwoRepo.findOne( wniosekId ));
	}

	
	
	
	
}
