package org.kossowski.optima.converters;

import org.kossowski.optima.enums.WyksztalcenieEnum;

public class WyksztalcenieConverter {

	public Integer toFactor( WyksztalcenieEnum w ) {
		return w.getFactorId();
	}

	public WyksztalcenieEnum fromFactor( int w ) {
		
		switch( w ) {
		case 2 : return WyksztalcenieEnum.ZAWODOWE;
		case 3 : return WyksztalcenieEnum.SREDNIE;
		case 9 : return WyksztalcenieEnum.WYZSZE_MAGISTER;
		case 8 : return WyksztalcenieEnum.WYZSZE_LICENCJAT;
		case 6 : return WyksztalcenieEnum.PODSTAWOWE;
		case 7 : return WyksztalcenieEnum.SZKOLA_POLICEALNA;
		
		default:
			return null;
		}
		
		
	}

}
