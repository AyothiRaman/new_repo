package com.hospitalDetails.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hospitalDetails.entity.OrderCreationEntity;

@Repository
public interface OrderCreationRepository extends CrudRepository<OrderCreationEntity, Integer> {

}
