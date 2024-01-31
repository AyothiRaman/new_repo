package com.map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.map.MapEntity.CustomerDetails;
import com.map.MapEntity.ProductDetails;
import com.map.Repository.CustomerRepository;
import com.map.Repository.ProductRepository;

@SpringBootApplication
public class MappingApplication implements CommandLineRunner {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private ProductRepository productRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(MappingApplication.class, args);
	
	}

	@Override
	public void run(String... args) throws Exception {
		
		CustomerDetails cus = new CustomerDetails("agg", "male", 12);
		
		
		ProductDetails det = new ProductDetails(1, "cgga");
		cus.setProductDetails(det);
		customerRepository.save(cus);
		
	}

}
