package org.kossowski.optima.builders;

import org.kossowski.optima.AppOptima;
import org.kossowski.optima.app.DaneApp;
import org.kossowski.optima.app.NaglowekApp;
import org.kossowski.repo.WniosekRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppOptimaForPrescoringFromJPABuilder {
	
	@Autowired
	protected WniosekRepository wniosekRepo;
	
	public AppOptima build( Integer id ) {
		
		AppOptima app = new AppOptima();  
		app.setNaglowek(  buildNaglowek() );
		app.setDane( buildDane() );
		return app;
	}

	
	private NaglowekApp buildNaglowek() {
		return new NaglowekApp();
	}
	
	private DaneApp buildDane() {
		return new DaneApp();
	}
	
	
}
