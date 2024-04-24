package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class RestApiForAStructuredProductCatalogueApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiForAStructuredProductCatalogueApplication.class, args);
		System.err.println("done");
	}

}
