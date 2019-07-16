package com.stackroute.springmvc1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.stackroute.springmvc1")
public class ConfigClass {


	@Bean
	public User user(){
		User user = new User();
		user.setName("Ishu");
		return user;
	}
}
