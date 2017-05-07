package org.kossowski.optima.builders;

import org.kossowski.optima.app.PosrednictwoApp;

public class PosrednictwoFactorBuilder {

		PosrednictwoApp build() {
			PosrednictwoApp p = new PosrednictwoApp();
			
			p.setId( "D4649" );
			p.setPlacowkaId( "AA45455/111200" );
			p.setPracownikId( "AA45455/111201" );
			p.setNazwa( "AUTOKREDYTY" );
			
			return p;
		}
}
