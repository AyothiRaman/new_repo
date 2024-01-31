package com.hospitalDetails.service;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hospitalDetails.entity.DoctorDetails;
import com.hospitalDetails.entity.OrderCreationEntity;
import com.hospitalDetails.repository.DoctorRepository;
import com.hospitalDetails.repository.OrderCreationRepository;

@Service
public class OrderCreationService {

	@Autowired
	private OrderCreationRepository orderCreationRepository;

	 	// Method to get the Order Creation Details
	public List<OrderCreationEntity> getAllData() {
		return (List<OrderCreationEntity>) orderCreationRepository.findAll();
	}
	
	// Method to save the Order Details
	public OrderCreationEntity saveData(OrderCreationEntity entity) {
		return orderCreationRepository.save(entity);
	}

	// Method to get the Ordered Details based on ID
	public ResponseEntity<Optional<OrderCreationEntity>> getData(int id) {
		Optional<OrderCreationEntity> entity = orderCreationRepository.findById(id);

		return ResponseEntity.ok(entity);

	}
}