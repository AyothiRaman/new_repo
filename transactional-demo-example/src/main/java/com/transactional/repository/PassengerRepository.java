package com.transactional.repository;

import com.transactional.entity.PassengerInformation;
import org.springframework.data.repository.CrudRepository;

public interface PassengerRepository extends CrudRepository<PassengerInformation,Long> {

}
