package com.course.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.course.Entity.CourseEntity;

public interface CourseRepository extends JpaRepository<CourseEntity, Long>{

	Optional<CourseEntity> findByCourseName(String username);

}
