package com.hospitalDetails.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hospitalDetails.entity.OrderCreationEntity;
import com.hospitalDetails.service.OrderCreationService;

@Controller
@RequestMapping("/api/order")
public class OrderCreationController {

	@Autowired
	private OrderCreationService creationService;

	@GetMapping("/order")
	public String findData(Model model) {
		model.addAttribute("OrderList", creationService.getAllData());

		return "orderCreated";
	}

	@PostMapping
	public OrderCreationEntity saveEvaluationData(@RequestBody OrderCreationEntity entity) {
		return creationService.saveData(entity);

	}

	@GetMapping("{id}")
	public ResponseEntity<Optional<OrderCreationEntity>> getDataById(@PathVariable int id) {
		return creationService.getData(id);
	}

}
