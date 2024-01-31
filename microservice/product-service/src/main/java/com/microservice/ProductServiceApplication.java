package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.microservice.model.Product;

@SpringBootApplication
public class ProductServiceApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
		
		Product p = new Product();
		
		
	}

}
