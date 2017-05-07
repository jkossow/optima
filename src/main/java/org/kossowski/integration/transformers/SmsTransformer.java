package org.kossowski.integration.transformers;


import java.util.Date;

import org.kossowski.optima.SmsOptima;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Component;

@Component
public class SmsTransformer {
	
	public SmsOptima toOptima( Object o, MessageHeaders headers ) {
		
		SmsOptima  s = sampleSmsOptima();
		
		return s;
	}
	
	public SmsOptima sampleSmsOptima() {
		
		SmsOptima s = new SmsOptima();
		s.setDate( new Date() );
		s.getSms().setWniosek( 1033 );
		
		return s;
	}

}
