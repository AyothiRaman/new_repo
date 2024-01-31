package com.leaf.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.leaf.Service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeservice;
	
	@GetMapping("/mynthra")
	public String getValue(Model model) {
		model.addAttribute("EmployeeList", employeeservice.findAll());
		return "mynthra";
	}

}
