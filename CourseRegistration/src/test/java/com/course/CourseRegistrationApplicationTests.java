package com.course;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.course.Entity.CourseEntity;
import com.course.Repository.CourseRepository;

@SpringBootTest
class CourseRegistrationApplicationTests {
	
	@Autowired
	CourseRepository courseRepository;

	@Test
	void contextLoads() {
		
		CourseEntity entity = new CourseEntity();
		entity.setCourseName("ddd");
		entity.setCourseCode("3");
		courseRepository.findById(null);
		
	}

}
