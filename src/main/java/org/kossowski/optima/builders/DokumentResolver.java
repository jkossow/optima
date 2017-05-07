package org.kossowski.optima.builders;



import org.kossowski.optima.app.Dokument;
import org.kossowski.optima.app.dokumenty.Decyzja;
import org.kossowski.optima.app.dokumenty.DzialalnoscGospodarcza;
import org.kossowski.optima.app.dokumenty.Oswiadczenie;
import org.kossowski.optima.app.dokumenty.ZaswiadczenieZp;
import org.kossowski.optima.converters.DochodWydatekConverter;
import org.kossowski.optima.enums.DecyzjaDotyczy;
import org.kossowski.optima.enums.DochodWydatekTyp;

public class DokumentResolver {
	
	private FactorDatabaseContext ctx;
	
	public DokumentResolver() {};
	
	public DokumentResolver( FactorDatabaseContext ctx ) {
		this.ctx = ctx;
	}
	
	public Dokument getDokument() {
		
		DochodWydatekTyp rd =  new DochodWydatekConverter().fromFactor( ctx.getWnioskodawca().getDochod().getTyp() );
		
		
		switch( rd ) {
			
			case EMERYTURA : return emerytura(); 
			case RENTA : return renta();
			case GOSPODARSTWO_ROLNE: return gospodarstwoRolne();
			case PRACA:	return praca();
			case UMOWA_ZLECENIE: return umowaZlecenie();
			case UMOWA_DZIELO: return umowaDzielo();
			case DZIALALNOSC_GOSPODARCZA: return dzialGosp();
			case ZASILEK_PRZEDEMERYTALNY: return zasilekPrzedemerytalny();
			
			default:
				return null;
		}
		
		//return null;
	}
	
	//path2
	private Dokument emerytura() {
		Decyzja d = new Decyzja();
		d.setDecyzjaDotyczy( DecyzjaDotyczy.EMERYTURY );
		
		return d;
	}
	
	//path2
	private Dokument renta() {
		Decyzja d = new Decyzja();
		d.setDecyzjaDotyczy( DecyzjaDotyczy.RENTY );
		return d;
		
	}
	
	//path3
	private Dokument gospodarstwoRolne() {
		//GospodarstwoRolne gr = new GospodarstwoRolne();
		// nie wiem jaki dokument dopasować
		return null;
	}
	
	// path1
	private Dokument praca() {
		
		ZaswiadczenieZp zp = new ZaswiadczenieZp();
		return zp;
	}
	
	//path1
	private Dokument umowaZlecenie() {
		Oswiadczenie o = new Oswiadczenie();
		
		return o;
		
	}

	//path1
	private Dokument umowaDzielo() {
		Oswiadczenie o = new Oswiadczenie();
		return o;
	};
	
	
	//path3
	private Dokument dzialGosp() { 
		
		DzialalnoscGospodarcza d = new DzialalnoscGospodarcza();
		return d;
	};

	
	//path2
	private Dokument zasilekPrzedemerytalny() {
		Decyzja d = new Decyzja();
		d.setDecyzjaDotyczy( DecyzjaDotyczy.ZASILKU_PRZEDEMERYTALNEGO );
		return d;
	}
		
}
