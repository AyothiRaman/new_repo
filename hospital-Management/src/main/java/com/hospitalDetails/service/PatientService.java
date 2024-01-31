package com.hospitalDetails.service;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hospitalDetails.entity.PatientDetails;
import com.hospitalDetails.repository.PatientRepository;

@Service
public class PatientService {

	@Autowired
	private PatientRepository patientRepository;

	// Method to get the Patient details
	public List<PatientDetails> getAllData() {
		return (List<PatientDetails>) patientRepository.findAll();
	}

	// Method to save the patient details
	public PatientDetails saveData(PatientDetails entity) {
		return patientRepository.save(entity);
	}

	// Method to get the Patient details based on ID
	public ResponseEntity<Optional<PatientDetails>> getData(int id) {
		Optional<PatientDetails> entity = patientRepository.findById(id);

		return ResponseEntity.ok(entity);
	}

}
