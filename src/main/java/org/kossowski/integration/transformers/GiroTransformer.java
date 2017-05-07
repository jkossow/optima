package org.kossowski.integration.transformers;


import java.util.Date;

import org.kossowski.optima.GiroOptima;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Component;

@Component
public class GiroTransformer {
	
	public GiroOptima toOptima( Object o, MessageHeaders headers ) {
		
		
		
		return sampleGiroOptima();
	}
	
	public GiroOptima sampleGiroOptima() {
		
		GiroOptima g = new GiroOptima();
		
		g.setUmowa(1033);
		g.setData( new Date() );
		g.setStatus( 0 );
		
		return g;
	}

}
