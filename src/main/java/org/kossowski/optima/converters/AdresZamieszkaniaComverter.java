package org.kossowski.optima.converters;

import org.kossowski.domain.AdresZamieszkaniaFactorDB;
import org.kossowski.optima.app.AdresZamieszkania;

public class AdresZamieszkaniaComverter {
	
	public static AdresZamieszkaniaFactorDB toFactor( AdresZamieszkania a ) {
		AdresZamieszkaniaFactorDB aFactor = new AdresZamieszkaniaFactorDB();
		
		aFactor.setMiejscowosc(  a.getMiejscowosc() );
		aFactor.setUlica( a.getUlica() );
		aFactor.setNrDomu( a.getNrDomu() );
		aFactor.setNrLokalu( a.getNrLokalu() );
		aFactor.setKodPocztowy( a.getKod() );
		aFactor.setCzasZamieszkaniaPodAdresem( a.getCzasZamieszkaniaPodAdresem() );
		
		return aFactor;
	}
	
	public static AdresZamieszkania fromFactor( AdresZamieszkaniaFactorDB a ) {
		
		AdresZamieszkania aApp = new AdresZamieszkania();
		
		aApp.setMiejscowosc( a.getMiejscowosc() );
		aApp.setUlica( a.getUlica() );
		aApp.setNrDomu( a.getNrDomu() );
		aApp.setNrLokalu( a.getNrLokalu() );
		aApp.setKod( a.getKodPocztowy() );
		aApp.setCzasZamieszkaniaPodAdresem( a.getCzasZamieszkaniaPodAdresem() );
		
		return aApp;
	}

}
