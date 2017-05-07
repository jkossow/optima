package org.kossowski;

import org.kossowski.optima.web.JSFConfig;
import org.kossowski.optima.web.JSFInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.config.EnableIntegration;





@SpringBootApplication
@EnableIntegration
@ImportResource({"classpath*:applicationContext.xml"})
@EnableAutoConfiguration //  (exclude={WebMvcAutoConfiguration.class,DispatcherServletAutoConfiguration.class })
public class SpJpaDataApplication extends SpringBootServletInitializer {


	
	public static void main(String[] args)  {

		
	
		//new SpringApplicationBuilder(SpJpaDataApplication.class).web(true).run();
		SpringApplication.run( SpJpaDataApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure( SpringApplicationBuilder builder) {
		builder.sources( new Class[] { JSFConfig.class, JSFInitializer.class } );
		return builder;
	}
}
