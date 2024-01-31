package com.database.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.database.Controller.Model.MongoModel;
import com.database.Controller.Repository.MongoRepo;

@RestController
public class MongoController {
	
	@Autowired
	private MongoRepo mongorepo;
	
	
	@PostMapping("/save")
	public String saveData(@RequestBody MongoModel mod) {
		mongorepo.save(mod);
		return " added"+mod.getId();
	}
	
	@GetMapping("/all")
	public List<MongoModel> getData(){
	 return  mongorepo.findAll();
	}
	
	@GetMapping("/get/{id}")
	public Optional<MongoModel> findData(@PathVariable (value="id") Integer id){
		return mongorepo.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteData(@PathVariable ("id") Integer id) {
		Optional<MongoModel> mon = mongorepo.findById(id);
		
		if(mon.isPresent()) {
			 mongorepo.deleteAll();
			 return "deleted sucessfully";
		}
		
		else {
			return "data not found";
		}
	}
	

}
