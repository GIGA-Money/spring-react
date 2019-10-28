package com.springreact.springreact;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
/**
 * 
 * @author GIGA-Money
 *  This is the main for the application.
 *  When using the h2 db for local mem testing: jdbc:h2:mem:testdb .
 */
public class SpringreactApplication {

    private static final Logger logger = LoggerFactory.getLogger(SpringreactApplication.class);
  
	public static void main(String[] args) {
		SpringApplication.run(SpringreactApplication.class, args);
		logger.info("anything goes");
	}

}
