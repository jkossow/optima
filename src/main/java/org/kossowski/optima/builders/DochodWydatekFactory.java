package org.kossowski.optima.builders;

import org.kossowski.optima.app.DochodWydatek;
import org.kossowski.optima.app.dochodWydatek.DochodDzialalnoscGospodarcza;
import org.kossowski.optima.app.dochodWydatek.Emerytura;
import org.kossowski.optima.app.dochodWydatek.GospodarstwoRolne;
import org.kossowski.optima.app.dochodWydatek.InneDochod;
import org.kossowski.optima.app.dochodWydatek.InneWydatek;
import org.kossowski.optima.app.dochodWydatek.MOPS;
import org.kossowski.optima.app.dochodWydatek.Praca;
import org.kossowski.optima.app.dochodWydatek.PracaBrakDokumentow;
import org.kossowski.optima.app.dochodWydatek.ProgramSocjalny;
import org.kossowski.optima.app.dochodWydatek.Renta;
import org.kossowski.optima.app.dochodWydatek.UmowaDzielo;
import org.kossowski.optima.app.dochodWydatek.UmowaZlecenie;
import org.kossowski.optima.app.dochodWydatek.ZajecieKomornicze;
import org.kossowski.optima.app.dochodWydatek.ZasilekPrzedemerytalny;
import org.kossowski.optima.enums.DochodWydatekTyp;

public class DochodWydatekFactory {
	
	public static DochodWydatek newInstance( DochodWydatekTyp typ ) {
		
		switch( typ ) {
			case RENTA : return new Renta();
			case EMERYTURA : return new Emerytura(); 
			case ZASILEK_PRZEDEMERYTALNY: return new ZasilekPrzedemerytalny();
			case PRACA:	return new Praca();
			case UMOWA_ZLECENIE: return new UmowaZlecenie();
			case UMOWA_DZIELO: return new UmowaDzielo();
			case DZIALALNOSC_GOSPODARCZA: return new DochodDzialalnoscGospodarcza();
			case PRACA_BRAK_DOKUMENTOW : return new PracaBrakDokumentow();
			case MOPS: return new MOPS();
			case GOSPODARSTWO_ROLNE: return new GospodarstwoRolne();
			case INNE_DOCHOD: return new InneDochod();
			case PROGRAM_SOCJALNY: return new ProgramSocjalny();
			case ZAJECIE_KOMORNICZE: return new ZajecieKomornicze();
			case INNE_WYDATKI: return new InneWydatek();
		
			default:
				return null;
		}
		
		
		
		
	}

}
