package org.kossowski;

import org.kossowski.optima.builders.FactorJpaContextHelper;
import org.kossowski.optima.builders.FactorJpaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	
	@Bean
	public FactorJpaContextHelper factorJpaContextHelper() {
		return new FactorJpaContextHelper();
	}
	
	@Bean 
	public FactorJpaService factorService() {
		return new FactorJpaService();
	}
	
}
