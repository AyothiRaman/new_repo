package com.hospitalDetails.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalDetails.entity.PatientDetails;
import com.hospitalDetails.service.PatientService;

@RestController
@RequestMapping("/api/patient")
public class PatientController {

	@Autowired
	private PatientService patientService;

	@GetMapping("/patient")
	public String findData(Model model) {
		model.addAttribute("PatientList", patientService.getAllData());

		return "patientDetails";
	}

	@PostMapping
	public PatientDetails saveEvaluationData(@RequestBody PatientDetails entity) {
		return patientService.saveData(entity);

	}

	@GetMapping("{id}")
	public ResponseEntity<Optional<PatientDetails>> getDataById(@PathVariable int id) {
		return patientService.getData(id);
	}

}
