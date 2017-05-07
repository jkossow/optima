package org.kossowski.integration.transformers;


import org.kossowski.optima.AppOptima;
import org.kossowski.optima.builders.AppOptimaBuilder;
import org.kossowski.optima.builders.AppOptimaJPABuilder;
import org.kossowski.optima.builders.FactorDatabaseContext;
import org.kossowski.optima.builders.FactorJpaContextHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Component;

@Component
public class AppTransformer {
	
	@Autowired
	FactorJpaContextHelper ctxHelper;
	
	public AppOptima toOptima( Object o, MessageHeaders headers ) {
		
		
		
		Integer id = new Integer( headers.get("wn_id").toString() );
		System.out.println( "Id z trafo: " + id );
		
		FactorDatabaseContext ctx = ctxHelper.getCtx( id );
		// rozdzielic prescorring i nieprescoring
		
		//AppOptimaBuilder builder = new AppOptimaPrescoringJPABuilder(ctx);
		AppOptimaBuilder builder = new AppOptimaJPABuilder(ctx);
		
		AppOptima payload = builder.build();
		
		return payload;
	}

}
