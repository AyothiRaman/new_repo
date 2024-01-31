package com.hospitalDetails.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hospitalDetails.entity.DoctorDetails;
import com.hospitalDetails.repository.DoctorRepository;

@Service
public class DoctorService {

	@Autowired
	private DoctorRepository doctorRepository;

	// Method to get the Doctor Details
	public List<DoctorDetails> getAllData() {
		return (List<DoctorDetails>) doctorRepository.findAll();
	}

	// Method to save the Doctor details
	public DoctorDetails saveData(DoctorDetails entity) {
		return doctorRepository.save(entity);
	}

	// Method to get the Doctor Details based on ID
	public ResponseEntity<Optional<DoctorDetails>> getData(int id) {
		Optional<DoctorDetails> entity = doctorRepository.findById(id);

		return ResponseEntity.ok(entity);
	}

}
