package com.arola.as.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages="com.arola.as.controllers")
public class ApplicationContextConfig {
	
	// have all beans here
	
	// the ViewResolver bean
	
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		
		resolver.setPrefix("WEB-INF/views/");
		resolver.setSuffix(".jsp");		
		
		return resolver;
	}
	
	

}
