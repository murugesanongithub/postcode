package com.htc.country.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * This is Spring Boot based Microservice Arichitecture style API service to fetch the records based on below API.
 * 
 * This microservice used H2 in build database 
 * 
 * 1. http://localhost:8080/ API to fetch all the records from the database 
 * 2. http://localhost:8080/{postcode} API to fetch based on postcode from the database
 * 3. http://localhost:8080/addrecord  API to insert list of records in to the database
 */
@SpringBootApplication
public class PostCodeServiceApsplication {

	// This is for demo 
	public static  void main(String[] args) {
		SpringApplication.run(PostCodeServiceApsplication.class, args);
		//
		
		/*
		 * this for adding two numbers
		 */
		int a = 10;
		int b = 20;
		int c = a + b ;
	}

}
