package com.hospitalDetails.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hospitalDetails.entity.DoctorDetails;

@Repository
public interface DoctorRepository extends CrudRepository<DoctorDetails, Integer> {

}
