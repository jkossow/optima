package org.kossowski.optima.builders;



import org.kossowski.optima.app.DochodWydatek;
import org.kossowski.optima.app.dochodWydatek.DochodDzialalnoscGospodarcza;
import org.kossowski.optima.app.dochodWydatek.Emerytura;
import org.kossowski.optima.app.dochodWydatek.GospodarstwoRolne;
import org.kossowski.optima.app.dochodWydatek.Praca;
import org.kossowski.optima.app.dochodWydatek.Renta;
import org.kossowski.optima.app.dochodWydatek.UmowaDzielo;
import org.kossowski.optima.app.dochodWydatek.UmowaZlecenie;
import org.kossowski.optima.app.dochodWydatek.ZasilekPrzedemerytalny;
import org.kossowski.optima.converters.DochodWydatekConverter;
import org.kossowski.optima.enums.DochodWydatekTyp;

public class DochodWydatekResolver {
	
	private FactorDatabaseContext ctx;
	
	public DochodWydatekResolver() {};
	
	public DochodWydatekResolver( FactorDatabaseContext ctx ) {
		this.ctx = ctx;
	}
	
	public DochodWydatek getDochodWydatek() {
		
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
	
	}
	
	// kwotę brutto zostawiamy
	// path2
	private DochodWydatek emerytura() {
		
		Emerytura e = new Emerytura();
		e.setOkresOd( ctx.getPath2().getOkresOd() );
		e.setOkresDo( ctx.getPath2().getOkresDo() );
		e.setBezterminowo( ctx.getPath2().idBezterminowo() );
		e.setKwotaNetto( ctx.getPath2().getDochod() );
		
		return e;
	}
	
	//path2
	private DochodWydatek renta() {
		Renta r = new Renta();
		
		r.setOkresOd( ctx.getPath2().getOkresOd() );
		r.setOkresDo( ctx.getPath2().getOkresDo() );
		r.setBezterminowo( ctx.getPath2().idBezterminowo() );
		r.setKwotaNetto( ctx.getPath2().getDochod() );
		
		return r;
		
	}
	
	// path3
	private DochodWydatek gospodarstwoRolne() {
		GospodarstwoRolne gr = new GospodarstwoRolne();
		
		//gr.setKwotaNetto( ctx.getPath3().getDochod() );
		//gr.setOkresOd( ctx.getPath3().getDataRolnikGosp() );
		//gr.setOkresDo( ctx.getPath3().getOkresDo() );
		//gr.setBezterminowo( ctx.getPath3().idBezterminowo() );
		
		return gr;
	}
	
	//path1
	private DochodWydatek praca() {
		
		Praca p = new Praca();
		
		p.setKwotaNetto( ctx.getPath1().getDochod() );
		p.setOkresOd( ctx.getPath1().getOkredOd() );
		p.setOkresDo( ctx.getPath1().getOkresDo() );
		//p.setBezterminowo( ctx.getPath1().isBezterminowo() );
		
		return p;
	}
	
	//path1
	private DochodWydatek umowaZlecenie() {
		UmowaZlecenie uz = new UmowaZlecenie();
		
		uz.setKwotaNetto( ctx.getPath1().getDochod() );
		uz.setOkresOd( ctx.getPath1().getOkredOd() );
		uz.setOkresDo( ctx.getPath1().getOkresDo() );
		//uz.setBezterminowo( ctx.getPath1().isBezterminowo() );
		
		return uz;
		
	}
	
	//path1
	private DochodWydatek umowaDzielo() {
		UmowaDzielo ud = new UmowaDzielo();
		
		ud.setKwotaNetto( ctx.getPath1().getDochod() );
		ud.setOkresOd( ctx.getPath1().getOkredOd() );
		ud.setOkresDo( ctx.getPath1().getOkresDo() );
		//ud.setBezterminowo( ctx.getPath1().isBezterminowo() );
		
		return ud;
	};
	
	//path3
	private DochodWydatek dzialGosp() { 
		
		DochodDzialalnoscGospodarcza d = new DochodDzialalnoscGospodarcza();
		//d.setKwotaNetto( ctx.getPath3().getDochod() );
		//d.setOkresOd( ctx.getPath3().getDzialalnoscOd());
		return d;
	};

	//path2
	private DochodWydatek zasilekPrzedemerytalny() {
		ZasilekPrzedemerytalny zas = new ZasilekPrzedemerytalny();
		
		zas.setOkresOd( ctx.getPath2().getOkresOd() );
		zas.setOkresDo( ctx.getPath2().getOkresDo() );
		zas.setBezterminowo( ctx.getPath2().idBezterminowo() );
		zas.setKwotaNetto( ctx.getPath2().getDochod() );
		
		return zas;
	}
		
}
