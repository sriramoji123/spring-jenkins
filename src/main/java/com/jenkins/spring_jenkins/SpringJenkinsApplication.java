package com.jenkins.spring_jenkins;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

import org.slf4j.Logger;


@SpringBootApplication
public class SpringJenkinsApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Application started");
		logger.info("Application started second");
	}

	public static void main(String[] args) {
		logger.info("application executed");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
