package org.kossowski.optima.builders;

import java.math.BigDecimal;
import java.util.Date;

import org.kossowski.domain.Wniosek;
import org.kossowski.domain.Wnioskodawca;
import org.kossowski.optima.AppOptima;
import org.kossowski.optima.FactorAppOptima;
import org.kossowski.optima.app.AdresMeldunkowy;
import org.kossowski.optima.app.DochodWydatek;
import org.kossowski.optima.app.Dokument;
import org.kossowski.optima.app.Telefon;
import org.kossowski.optima.app.WnioskodawcaApp;
import org.kossowski.optima.app.Zgoda;
import org.kossowski.optima.converters.StanCywilnyConverter;
import org.kossowski.optima.enums.MieszkanieTyp;
import org.kossowski.optima.enums.WyksztalcenieEnum;
import org.kossowski.optima.enums.ZgodaTyp;
import org.kossowski.optima.enums.ZrodloInformacjiEnum;

public class AppOptimaJPABuilder implements AppOptimaBuilder {

	
	private FactorDatabaseContext ctx;
	
	public AppOptimaJPABuilder( FactorDatabaseContext ctx ) {
		this.ctx  = ctx;
	}
	
	@Override
	public AppOptima build( ) {
		
		
		
		Wniosek wniosek = ctx.getWniosek();
		Wnioskodawca wnioskodawca = ctx.getWnioskodawca();
		
		
		AppOptima xml = new FactorAppOptima();
		AppOptimaFacade facade = new AppOptimaFacade( xml );
		
		facade.setId( wniosek.getId()  );
		facade.setTyp("Comfort");
		facade.setRodzaj("Nowy");
		
		//facade.setKwota( wniosek.getKwotaKredytu()  );
		//facade
		
		facade.setKwota( new BigDecimal(2000) );
		facade.setOkres( 40 );
		
		
		facade.setZrodloInformacji( ZrodloInformacjiEnum.INTERNET );
		
		facade.setDataPodpisania( new Date() );
		facade.setKtoPodpisal("jk");
		
		
		WnioskodawcaApp  wo = new WnioskodawcaApp();
		wo.setImie( wnioskodawca.getImie() );
		wo.setNazwisko( wnioskodawca.getNazwisko() );
		wo.setPesel( wnioskodawca.getPesel() );
		wo.setDowodOsobisty( wnioskodawca.getSeriaNrDowodu() );
		wo.setStanCywilny(   new StanCywilnyConverter().fromFactor(  wnioskodawca.getStanCywilny()  ) );
		wo.setIleOsobWRodzinie( wnioskodawca.getIleOsobWRodzinie() );
		wo.setSkanDowodu(true);
		
		wo.setWyksztalcenie( WyksztalcenieEnum.SREDNIE );
		wo.setMieszkanieTyp( MieszkanieTyp.TBS);
		
		//int czasZamieszkiwaniaPodAdresem = DateUtils.dateDiffInYears(ctx.getWniosek()., d2)
		
		//wo.addAddress( new AdresZamieszkania( wnioskodawca.getUlicaMeldunek(), wnioskodawca.getNrDomuMeldunek(), 
		//		wnioskodawca.getNrMieszkaniaMieldunek(), wnioskodawca.getKodPocztowyMeldunek(), wnioskodawca.getMiejscowoscMeldunek(), 
		//		CzasZamieszkaniaPodAdresem.WIECEJ ));
		
		wo.addAddress( new AdresMeldunkowy( "Sadowa", "7", "19", "97-500", "Radomsko", 
				true, new Date() ));
		
		facade.setWnioskodawca(wo);
		
		DochodWydatek dw = (new DochodWydatekResolver(ctx)).getDochodWydatek();
		wo.addDochod( dw );
		System.out.println( dw );
		
		Dokument d = (new DokumentResolver(ctx)).getDokument();
		wo.addDokument(d);
		/*
		wo.addDochod( new Praca( new BigDecimal( 2500 )) );
		wo.addWydatek( new InneWydatek( new BigDecimal( 100 )));
		*/
		wo.addTelefon( new Telefon( 1, "796821395", true ));
		
		//wo.addDzienOdbioruDochodow( new DzienOdbioruDochodu( 30 ));
		
		wo.addZgoda( new Zgoda(  ZgodaTyp.ZGODA_1, "Optima S.A.", new Date(), true ));
		wo.addZgoda( new Zgoda(  ZgodaTyp.ZGODA_5, "Optima S.A.", new Date(), true ));
		wo.addZgoda( new Zgoda(  ZgodaTyp.ZGODA_12, "Optima S.A.", new Date(), true ));
		
		wo.addZgoda( new Zgoda(  ZgodaTyp.ZGODA_2, "Optima S.A.", new Date(), true ));
		wo.addZgoda( new Zgoda(  ZgodaTyp.ZGODA_3, "Optima S.A.", new Date(), true ));
		wo.addZgoda( new Zgoda(  ZgodaTyp.ZGODA_4, "Optima S.A.", new Date(), true ));
		wo.addZgoda( new Zgoda(  ZgodaTyp.ZGODA_13, "Optima S.A.", new Date(), true ));
		
		return facade.getWniosek();
		
	}

}
