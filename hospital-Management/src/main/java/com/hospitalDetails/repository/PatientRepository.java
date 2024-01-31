package com.hospitalDetails.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hospitalDetails.entity.PatientDetails;

@Repository
public interface PatientRepository extends CrudRepository<PatientDetails, Integer> {

}
