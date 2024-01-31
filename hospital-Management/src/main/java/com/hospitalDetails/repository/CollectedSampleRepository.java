package com.hospitalDetails.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hospitalDetails.entity.CollectedSamplesDetails;

@Repository
public interface CollectedSampleRepository extends CrudRepository<CollectedSamplesDetails, Integer> {

}
