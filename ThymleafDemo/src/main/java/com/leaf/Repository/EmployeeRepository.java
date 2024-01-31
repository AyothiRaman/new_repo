package com.leaf.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leaf.Entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer>{

}
