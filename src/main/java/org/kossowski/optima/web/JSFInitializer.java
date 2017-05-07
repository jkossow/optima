package org.kossowski.optima.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JSFInitializer implements ServletContextInitializer {

	@Override
	public void onStartup(ServletContext sc) throws ServletException {
		// TODO Auto-generated method stub
		sc.setInitParameter( "com.sun.faces.forceLoadConfiguration", "true");
		sc.setInitParameter("primefaces.CLIENT_SIDE_VALIDATION", "true");
		sc.setInitParameter("javax.faces.PROJECT_STAGE", "Development");
		sc.setInitParameter( "javax.faces.WEBAPP_RESOURCES_DIRECTORY", "/WEB-INF/resources/" );

	}

}
