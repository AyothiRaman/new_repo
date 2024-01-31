package com.map.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.map.MapEntity.CustomerDetails;
import com.map.MapService.CustomerService;
import com.map.Request.OrderRequest;

@Controller
public class MapController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/order")
	public CustomerDetails details(OrderRequest request) {
		return  customerService.orderPlaced(request);
	}
	
	@GetMapping("/get")
	public List<CustomerDetails> findAllOrders(){
		return customerService.getAllData();
	}

}
