package org.kossowski.integration;

import org.kossowski.repo.StatusWnioskuRepository;
import org.kossowski.repo.WniosekRepository;
import org.kossowski.repo.WnioskodawcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WniosekHandler {
	
	@Autowired
	protected WniosekRepository wnRepo;
	
	@Autowired
	protected StatusWnioskuRepository statusRepo;
	
	@Autowired
	protected WnioskodawcaRepository wnioskodawcaRepo;
	
	public void print( Object  o ) {
		System.out.println("Klasa payload " + o.getClass().getName());
		System.out.println( o.toString() );
		
	}
	

}
