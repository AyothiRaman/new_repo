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
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.hospitalDetails.entity.DoctorDetails;
import com.hospitalDetails.service.DoctorService;

@Controller
@RequestMapping("/api/doctor")
public class DoctorController {

	@Autowired
	private DoctorService doctorService;

	@GetMapping("/doctor")
	public String findData(Model model) {
		model.addAttribute("DoctorList", doctorService.getAllData());

		return "doctorDetails.html";
	}

	@PostMapping("/save")
	public DoctorDetails saveEvaluationData(@RequestBody DoctorDetails entity) {
		return doctorService.saveData(entity);

	}

	@GetMapping("{id}")
	public ResponseEntity<Optional<DoctorDetails>> getDataById(@PathVariable int id) {
		return doctorService.getData(id);
	}

}
