package com.akhil.rest.webservices.restfulwebservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.akhil.rest.webservices.restfulwebservices.controller","com.akhil.rest.webservices.restfulwebservices.repository.DepartmentRepository","com.akhil.rest.webservices.restfulwebservices.service"})
@SpringBootApplication
public class RestfulWebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServicesApplication.class, args);
	}

}
