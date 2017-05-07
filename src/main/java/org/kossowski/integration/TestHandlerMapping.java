package org.kossowski.integration;

import java.util.ArrayList;
import java.util.List;

import org.kossowski.domain.OptimaMultiOferta;
import org.kossowski.domain.Wniosek;
import org.kossowski.optima.Dec0Optima;
import org.kossowski.optima.dec.Offer;
import org.kossowski.repo.WniosekRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestHandlerMapping {

	@Autowired
	protected WniosekRepository wnRepo;
	
	public void printOffers( Dec0Optima dec0) {
		System.out.println( dec0 );
		
		Wniosek wn = wnRepo.findOne( dec0.getId() );
		
		List<OptimaMultiOferta> offers = new ArrayList<>();
		
		for( Offer o : dec0.getOffer() )
			offers.add( new OptimaMultiOferta(o));
		
		wn.setMultiOferty(  offers );
		wnRepo.save(wn);
	}
	
}
