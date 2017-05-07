package org.kossowski.optima.builders;

import java.math.BigDecimal;
import java.util.Date;

import org.kossowski.optima.AppOptima;
import org.kossowski.optima.FactorAppOptima;
import org.kossowski.optima.app.AdresMeldunkowy;
import org.kossowski.optima.app.AdresZamieszkania;
import org.kossowski.optima.app.DzienOdbioruDochodu;
import org.kossowski.optima.app.Telefon;
import org.kossowski.optima.app.WnioskodawcaApp;
import org.kossowski.optima.app.Zgoda;
import org.kossowski.optima.app.dochodWydatek.InneWydatek;
import org.kossowski.optima.app.dochodWydatek.Praca;
import org.kossowski.optima.enums.CzasZamieszkaniaPodAdresem;
import org.kossowski.optima.enums.MieszkanieTyp;
import org.kossowski.optima.enums.StanCywilny;
import org.kossowski.optima.enums.WyksztalcenieEnum;
import org.kossowski.optima.enums.ZgodaTyp;
import org.kossowski.optima.enums.ZrodloInformacjiEnum;
import org.kossowski.repo.WniosekRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AppOptimaStandardLimitedDocsBuilder implements AppOptimaBuilder {

	@Autowired
	protected WniosekRepository wniosekRepo;
	
	
	@SuppressWarnings("deprecation")
	@Override
	public AppOptima build() {
		
		AppOptima xml = new FactorAppOptima();
		AppOptimaFacade f = new AppOptimaFacade( xml );
		
		f.setId( 1033 );
		f.setTyp("Comfort");
		f.setRodzaj("Nowy");
		f.setKwota( new BigDecimal( 1500 ) );
		f.setOkres( 40 );
		f.setZrodloInformacji( ZrodloInformacjiEnum.INTERNET );
		
		f.setDataPodpisania( new Date() );
		f.setKtoPodpisal("Janusz Kossowski");
		f.setMiejscePodpisania("Radomsko");
		
		WnioskodawcaApp  w = new WnioskodawcaApp();
		w.setImie("Janusz");
		w.setNazwisko("Kossowski");
		w.setPesel("68090608412");
		w.setDowodOsobisty("AKW488831");
		w.setStanCywilny(  StanCywilny.ZAMEZNA_ZONATY );
		w.setIleOsobWRodzinie( 2 );
		w.setSkanDowodu( true );
		w.setWyksztalcenie( WyksztalcenieEnum.SREDNIE );
		w.setMieszkanieTyp( MieszkanieTyp.TBS );
		
		w.addAddress( new AdresZamieszkania( "Sadowa", "7", "19", "97-500", "Radomsko", 
				CzasZamieszkaniaPodAdresem.WIECEJ ));
		
		
		w.addAddress( new AdresMeldunkowy( "Sadowa", "7", "19", "97-500", "Radomsko", 
				true, new Date( 2003, 8, 3) ));
		
		f.setWnioskodawca(w);
		
		w.addDochod( new Praca( new BigDecimal( 1200 )) );
		w.addWydatek( new InneWydatek( new BigDecimal( 1300 )));
		
		w.addTelefon( new Telefon( 1, "796821395", true ));
		
		w.addDzienOdbioruDochodow( new DzienOdbioruDochodu( 30 ));
		
		w.addZgoda( new Zgoda(  ZgodaTyp.ZGODA_1, "Optima S.A.", new Date(), true ));
		w.addZgoda( new Zgoda(  ZgodaTyp.ZGODA_4, "Optima S.A.", new Date(), true ));
		w.addZgoda( new Zgoda(  ZgodaTyp.ZGODA_5, "Optima S.A.", new Date(), true ));
		w.addZgoda( new Zgoda(  ZgodaTyp.ZGODA_12, "Optima S.A.", new Date(), true ));
		
		w.addZgoda( new Zgoda(  ZgodaTyp.ZGODA_2, "Optima S.A.", new Date(), true ));
		w.addZgoda( new Zgoda(  ZgodaTyp.ZGODA_3, "Optima S.A.", new Date(), true ));
		w.addZgoda( new Zgoda(  ZgodaTyp.ZGODA_13, "Optima S.A.", new Date(), true ));
		
		return f.getWniosek();
		
	}

}
