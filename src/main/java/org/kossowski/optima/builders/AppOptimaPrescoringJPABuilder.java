package org.kossowski.optima.builders;

import java.util.Date;

import org.kossowski.domain.Wniosek;
import org.kossowski.domain.Wnioskodawca;
import org.kossowski.optima.AppOptima;
import org.kossowski.optima.FactorAppOptima;
import org.kossowski.optima.app.DochodWydatek;
import org.kossowski.optima.app.Telefon;
import org.kossowski.optima.app.WnioskodawcaApp;
import org.kossowski.optima.app.Zgoda;
import org.kossowski.optima.converters.StanCywilnyConverter;
import org.kossowski.optima.enums.ZgodaTyp;

public class AppOptimaPrescoringJPABuilder implements AppOptimaBuilder {

	
	private FactorDatabaseContext ctx;
	
	public AppOptimaPrescoringJPABuilder( FactorDatabaseContext ctx ) {
		this.ctx  = ctx;
	}
	
	@Override
	public AppOptima build( ) {
		
		
		
		Wniosek wniosek = ctx.getWniosek();
		Wnioskodawca wnioskodawca = ctx.getWnioskodawca();
		
		
		AppOptima xml = new FactorAppOptima();
		AppOptimaFacade facade = new AppOptimaFacade( xml );
		
		facade.setId( wniosek.getId()  );
		facade.setTyp("Prescoring");
		facade.setKwota( wniosek.getKwotaKredytu()  );
		System.out.println("Kwot kredytu : " + wniosek.getKwotaKredytu() );
		
		WnioskodawcaApp  wo = new WnioskodawcaApp();
		wo.setImie( wnioskodawca.getImie() );
		wo.setNazwisko( wnioskodawca.getNazwisko() );
		wo.setPesel( wnioskodawca.getPesel() );
		wo.setDowodOsobisty( wnioskodawca.getSeriaNrDowodu() );
		wo.setStanCywilny(   new StanCywilnyConverter().fromFactor(  wnioskodawca.getStanCywilny()  ) );
		wo.setIleOsobWRodzinie( wnioskodawca.getIleOsobWRodzinie() );
		
		
		
		//wo.addAddress( new AdresZamieszkania( wnioskodawca.getUlicaMeldunek(), wnioskodawca.getNrDomuMeldunek(), 
		//		wnioskodawca.getNrMieszkaniaMieldunek(), wnioskodawca.getKodPocztowyMeldunek(), wnioskodawca.getMiejscowoscMeldunek(), 
		//		CzasZamieszkaniaPodAdresem.WIECEJ ));
		
		//w.addAddress( new AdresMeldunkowy( "Sadowa", "7", "19", "97-500", "Radomsko", 
		//		true, new Date() ));
		
		facade.setWnioskodawca(wo);
		
		DochodWydatek dw = (new DochodWydatekResolver(ctx)).getDochodWydatek();
		wo.addDochod( dw );
		System.out.println( dw );
		/*
		wo.addDochod( new Praca( new BigDecimal( 2500 )) );
		wo.addWydatek( new InneWydatek( new BigDecimal( 100 )));
		*/
		wo.addTelefon( new Telefon( 1, "796821395", true ));
		
		//wo.addDzienOdbioruDochodow( new DzienOdbioruDochodu( 30 ));
		
		wo.addZgoda( new Zgoda(  ZgodaTyp.ZGODA_1, "Optima S.A.", new Date(), true ));
		wo.addZgoda( new Zgoda(  ZgodaTyp.ZGODA_5, "Optima S.A.", new Date(), true ));
		wo.addZgoda( new Zgoda(  ZgodaTyp.ZGODA_12, "Optima S.A.", new Date(), true ));
		
		return facade.getWniosek();
		
	}

}
