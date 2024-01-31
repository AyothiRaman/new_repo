package com.transactional.repository;

import com.transactional.entity.PaymentInformation;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<PaymentInformation , String> {
}
