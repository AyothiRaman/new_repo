package com.map.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.map.MapEntity.CustomerDetails;
import com.map.Request.OrderRequest;

public interface CustomerRepository extends JpaRepository<CustomerDetails, Integer> {

	CustomerDetails save(OrderRequest request);

}
