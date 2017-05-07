package org.kossowski.optima.builders;

import org.kossowski.domain.Path1;
import org.kossowski.domain.Path2;
import org.kossowski.domain.Path3;
import org.kossowski.domain.Wniosek;
import org.kossowski.domain.Wnioskodawca;

public class FactorDatabaseContext {
	
	//id wniosku - aby dwa razy nie odczytywać 
	private Integer id = 0;
	
	private Wniosek wniosek;
	private Wnioskodawca wnioskodawca;
	
	private Path1 path1;
	private Path2 path2;
	private Path3 path3;
	
	//private Bank bank;
	//private OptimaMultiOferta optimaMiltiOferta;
	//private RodzajDochodu rodzajDochodu;
	//private RozdzielnoscMajatkowa rozdzielnoscMajatkowa;
	//private SkanWniosku skanWniosku;
	//private TelefonRozliczenie telefonRozliczenie;
	//private Wojewodztwo wojewodztwo;
	//private Wojsko wojsko;
	//private Wyksztalcenie wyksztalcenie;
	
	
	
		
	public FactorDatabaseContext() {
		super();
		this.id = 0;
		this.wniosek = new Wniosek();
		this.wnioskodawca =  new Wnioskodawca();
		this.path1 = new Path1();
		this.path2 = new Path2();
		this.path3 = new Path3();
	}

	
	public static FactorDatabaseContext getNewInstanceForPrescoring() {
		FactorDatabaseContext ctx = new FactorDatabaseContext();
		ctx.getWniosek().setOptimaTyp( "prescoring" );
		ctx.getWniosek().setOptimaRodzaj("nowy");
		
		return ctx;
	}
	
	
	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Wniosek getWniosek() {
		return wniosek;
	}
	
	public void setWniosek(Wniosek wniosek) {
		id = wniosek != null ? wniosek.getId() : null;
		this.wniosek = wniosek;
	}
	
	public Wnioskodawca getWnioskodawca() {
		return wnioskodawca;
	}
	
	public void setWnioskodawca(Wnioskodawca wnioskodawca) {
		this.wnioskodawca = wnioskodawca;
	}
	
	public Path1 getPath1() {
		return path1;
	}
	
	public void setPath1(Path1 path1) {
		this.path1 = path1;
	}
	
	public Path2 getPath2() {
		return path2;
	}
	
	public void setPath2(Path2 path2) {
		this.path2 = path2;
	}
	
	public Path3 getPath3() {
		return path3;
	}
	
	public void setPath3(Path3 path3) {
		this.path3 = path3;
	}

		
	
}
