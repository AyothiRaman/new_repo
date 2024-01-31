package com.leaf.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.leaf.Entity.EmployeeEntity;
import com.leaf.Service.EmployeeService;

@Controller
public class WebController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@GetMapping("/flipkart")
	public String getData(Model model) {
		model.addAttribute("EmployeeList",employeeService.findAll());
		return "flipkart";
	}
	
	@GetMapping("/add new Employee")
	public String addNewEmployee(Model model){
		EmployeeEntity employee = new EmployeeEntity();
		model.addAttribute("employee", employee);
		return "employee";
		
	}

	@PostMapping("/SaveEmployee")
	public String saveData(EmployeeEntity employee) {
		employeeService.saveData(employee);
		return "redirect:/flipkart";
		
		
		
	}
}

