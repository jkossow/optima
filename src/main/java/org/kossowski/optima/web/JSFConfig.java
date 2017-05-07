package org.kossowski.optima.web;


import javax.faces.webapp.FacesServlet;

import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sun.faces.config.ConfigureListener;

@Configuration
public class JSFConfig {

	@Bean
	public ServletRegistrationBean servletRegistrationBean() {
		
		FacesServlet servlet = new FacesServlet();
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean( servlet, "/faces/*");
		return servletRegistrationBean;
	}
	
	@Bean
	public ServletListenerRegistrationBean<ConfigureListener> jsfConfigureListener() {
		return new ServletListenerRegistrationBean<>( new ConfigureListener() );
	}
	
}
