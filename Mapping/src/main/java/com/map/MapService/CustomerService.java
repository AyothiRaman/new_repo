package com.map.MapService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.map.MapEntity.CustomerDetails;
import com.map.Repository.CustomerRepository;
import com.map.Repository.ProductRepository;
import com.map.Request.OrderRequest;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	ProductRepository productRepository;
	
	public CustomerDetails orderPlaced(@RequestBody OrderRequest request) {
		return customerRepository.save(request);
	}
	
	public List<CustomerDetails> getAllData() {
		return customerRepository.findAll();
	}


}
