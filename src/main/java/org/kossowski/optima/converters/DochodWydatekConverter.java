package org.kossowski.optima.converters;

import org.kossowski.optima.enums.DochodWydatekTyp;

public class DochodWydatekConverter {
	
	
	/*
	public DochodWydatekTyp fromFactor( String dochod ) {
		
		switch( dochod ) {
		
		case "emerytura / renta" : return DochodWydatekTyp.EMERYTURA;
		case "kontrakt" : return DochodWydatekTyp.PRACA;
		case "renta inwalidzka" : return DochodWydatekTyp.RENTA;
		case "renta resortowa" : return DochodWydatekTyp.RENTA;
		case "renta rodzinna po zmarłym współmałżonku" : return DochodWydatekTyp.RENTA;
		case "renta rodzinna resortowa" : return DochodWydatekTyp.RENTA;
		case "renta strukturalna" : return DochodWydatekTyp.RENTA;
		case "rolnik - działy specjalne produkcji rolnej" : return DochodWydatekTyp.GOSPODARSTWO_ROLNE;
		case "umowa najmu lokalu" : return DochodWydatekTyp.DZIALALNOSC_GOSPODARCZA;
		case "umowa o pracę" : return DochodWydatekTyp.PRACA;
		case "umowa o pracę - pełny etat" : return DochodWydatekTyp.PRACA;
		case "umowa zlecenie / o dzieło" : return DochodWydatekTyp.UMOWA_ZLECENIE;
		case "urlop górniczy" : return DochodWydatekTyp.PRACA;
		case "urlop kolejowy" : return DochodWydatekTyp.PRACA;
		case "własna działalność" : return DochodWydatekTyp.DZIALALNOSC_GOSPODARCZA;
		case "wolne zawody" : return DochodWydatekTyp.DZIALALNOSC_GOSPODARCZA;
		case "zasiłek przedemerytalny" : return DochodWydatekTyp.ZASILEK_PRZEDEMERYTALNY;
		case "renta rodzinna po rodzicach" : return DochodWydatekTyp.RENTA;
		case "rolnik" : return DochodWydatekTyp.GOSPODARSTWO_ROLNE;
		case "umowa o dzieło" : return DochodWydatekTyp.UMOWA_DZIELO;

		default:
			return DochodWydatekTyp.INNE_DOCHOD;
		
		
		}
		
	}
	*/
	
public DochodWydatekTyp fromFactor( Integer dochod ) {
		
		
		switch( dochod ) {
		
			case 24 : return DochodWydatekTyp.RENTA;
			case 25 : return DochodWydatekTyp.EMERYTURA;
			case 18 : return DochodWydatekTyp.ZASILEK_PRZEDEMERYTALNY;
			case 11 : return DochodWydatekTyp.PRACA;
			case 26 : return DochodWydatekTyp.UMOWA_ZLECENIE;
			case 22 : return DochodWydatekTyp.UMOWA_DZIELO;
			case 16 : return DochodWydatekTyp.DZIALALNOSC_GOSPODARCZA;
			case 27 : return DochodWydatekTyp.PRACA_BRAK_DOKUMENTOW;
			case 28 : return DochodWydatekTyp.MOPS;
			case 21 : return DochodWydatekTyp.GOSPODARSTWO_ROLNE;
			case 29 : return DochodWydatekTyp.INNE_DOCHOD;
			case 30 : return DochodWydatekTyp.PROGRAM_SOCJALNY;
			case 31 : return DochodWydatekTyp.ZAJECIE_KOMORNICZE;
			case 32 : return DochodWydatekTyp.INNE_WYDATKI;
			
			

			default:
				return null;
		
		}
		
	}


	public Integer toFactor( DochodWydatekTyp typ ) {
		
		return typ.getFactorId();
	}


}
