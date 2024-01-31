package com.hospitalDetails.controller;

import java.util.List;
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

import com.hospitalDetails.entity.CollectedSamplesDetails;
import com.hospitalDetails.service.CollectedSampleService;

@RestController
@RequestMapping("/api/sample")
public class CollectedSampleController {

	@Autowired
	private CollectedSampleService collectedSampleService;

	@GetMapping("/sample")
	public String findData(Model model) {
		model.addAttribute("SampleList", collectedSampleService.getAllData());

		return "sampleCollected";
	}

	@PostMapping
	public CollectedSamplesDetails saveEvaluationData(@RequestBody CollectedSamplesDetails entity) {
		return collectedSampleService.saveData(entity);

	}

	@GetMapping("{id}")
	public ResponseEntity<Optional<CollectedSamplesDetails>> getDataById(@PathVariable int id) {
		return collectedSampleService.getData(id);
	}

}
