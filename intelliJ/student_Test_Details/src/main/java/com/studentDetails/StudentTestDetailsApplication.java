package com.studentDetails;

import com.studentDetails.entity.StudentEntity;
import com.studentDetails.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentTestDetailsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentTestDetailsApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private StudentEntity entity;

	@Override
	public void run(String... args) throws Exception {

		entity.setStudentId(1);
		entity.setFirst_name("sara");
		entity.setLast_name("khan");
		entity.setMobile_number(12345);

		studentRepository.save(entity);




	}
}
