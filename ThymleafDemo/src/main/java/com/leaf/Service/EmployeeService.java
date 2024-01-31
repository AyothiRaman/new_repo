package com.leaf.Service;

import java.util.List;
import java.util.Optional;

import javax.swing.text.html.Option;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leaf.Entity.EmployeeEntity;
import com.leaf.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeerepository;
	
	public EmployeeEntity saveData(EmployeeEntity entity) {
		return employeerepository.save(entity);
	}
	
	public EmployeeEntity findDataById(Integer empId) {
		return employeerepository.findById(empId).orElse(new EmployeeEntity());
	}
	
	public List<EmployeeEntity> findAll(){
		return employeerepository.findAll();
	}

	public String deleteById(Integer empId ) {
		Optional<EmployeeEntity> opt = employeerepository.findById(empId);
		
		if(opt.isPresent()) {
			employeerepository.deleteById(empId);
			return "deleted sucessfully";
		}
		else {
			return "data not found";
		}
	}
}
