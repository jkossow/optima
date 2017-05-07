package org.kossowski.optima.converters;



import org.kossowski.optima.enums.StanCywilny;


public class StanCywilnyConverter {
	
	public StanCywilny fromFactor( Integer stan ) {
		
		
		
		switch( stan ) {
			case 2 : return StanCywilny.ZAMEZNA_ZONATY;	
			case 3 : return StanCywilny.PANNA_KAWALER;
			case 4 : return StanCywilny.ROZWIEDZIONY_ROZWIEDZIONA;
			case 5 : return StanCywilny.WDOWA_WDOWIEC;
			case 7 : return StanCywilny.KONKUBINA_KONKUBENT;
			case 8 : return StanCywilny.KLIENT_ODMAWIA_PODANIA; 
			// case 6 : w Factoe separacja - brak w optima; 
		};
		
		return null;
		
	}
	
	public Integer toFactor( StanCywilny stan ) {
		
		return stan.getFactorId();
		
	}

}
