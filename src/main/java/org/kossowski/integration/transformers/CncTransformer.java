package org.kossowski.integration.transformers;



import java.util.Date;

import org.kossowski.optima.CncOptima;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Component;

@Component
public class CncTransformer {
	
	public CncOptima toOptima( Object o, MessageHeaders headers ) {
		
		return sampleCncOptima();
	}
	
	public CncOptima sampleCncOptima() {
		
		CncOptima c = new CncOptima();
		
		c.setId( 1033 );
		c.setCancelDateTime( new Date() );
		c.setCancelReason( 55, "Wniosek przeterminowany" );
		return c;
	}

}
