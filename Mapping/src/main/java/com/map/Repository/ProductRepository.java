package com.map.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.map.MapEntity.ProductDetails;

public interface ProductRepository extends JpaRepository<ProductDetails, Integer> {

}
