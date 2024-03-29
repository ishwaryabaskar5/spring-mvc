package com.stackroute.springmvc1;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

public class MyWebAppInitializer implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext container) {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.setConfigLocation("com.stackroute.springmvc1");
		
		container.addListener(new ContextLoaderListener(context));
		
		ServletRegistration.Dynamic dispatcher = container
				.addServlet("dispatcher", new DispatcherServlet(context));
		
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
	}
}