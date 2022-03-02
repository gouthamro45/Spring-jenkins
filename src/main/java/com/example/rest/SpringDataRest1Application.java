package com.example.rest;

import javax.annotation.PostConstruct;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class SpringDataRest1Application {

	public static Logger logger =(Logger) LoggerFactory.getLogger(SpringDataRest1Application.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application started");
	}
	public static void main(String[] args) {
		logger.info("Application Executing");
		SpringApplication.run(SpringDataRest1Application.class, args);
		
	}

}
