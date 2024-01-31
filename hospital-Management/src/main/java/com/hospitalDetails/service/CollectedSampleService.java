package com.hospitalDetails.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hospitalDetails.entity.CollectedSamplesDetails;
import com.hospitalDetails.repository.CollectedSampleRepository;

@Service
public class CollectedSampleService {

	@Autowired
	private CollectedSampleRepository collectedSampleRepository;

	// Method to find the List of Collected Sample Details
	public List<CollectedSamplesDetails> getAllData() {
		return (List<CollectedSamplesDetails>) collectedSampleRepository.findAll();
	}

	// Method to save the Collected sample Data
	public CollectedSamplesDetails saveData(CollectedSamplesDetails entity) {
		return collectedSampleRepository.save(entity);
	}

	// Method to get the data based on ID
	public ResponseEntity<Optional<CollectedSamplesDetails>> getData(int id) {
		Optional<CollectedSamplesDetails> entity = collectedSampleRepository.findById(id);

		return ResponseEntity.ok(entity);
	}

}
