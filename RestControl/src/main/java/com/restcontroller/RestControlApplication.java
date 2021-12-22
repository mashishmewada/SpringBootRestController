package com.restcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages={"com.restcontroller.Reposetries"})
@EntityScan(basePackages={"com.restcontroller.zbeans"})
@SpringBootApplication(scanBasePackages={"com.restcontroller"})
public class RestControlApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		
		SpringApplication.run(RestControlApplication.class, args);
		
	}
	
	@Override       
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RestControlApplication.class);
	}


}
