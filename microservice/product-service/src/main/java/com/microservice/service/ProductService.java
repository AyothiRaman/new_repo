package com.microservice.service;

import com.microservice.dto.ProductRequest;
import com.microservice.dto.ProductResponse;
import com.microservice.model.Product;
import com.microservice.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@Slf4j
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void createProduct(@RequestBody ProductRequest request) {

        Product product = Product.builder()
                .id(request.getId())
                .name(request.getName())
                .price(request.getPrice())
                .description(request.getDescription())
                .build();

        productRepository.save(product);

        log.info("product {} saved successfully", product.getId());
    }

    public List<ProductResponse> getAllDetailsOfProduct() {
        List<Product> products = productRepository.findAll();

        // to map each response to the product response

        return products.stream().map(this::mapToProductResponse).toList();
    }

    private ProductResponse mapToProductResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .description(product.getDescription())
                .name(product.getName())
                .price(product.getPrice())
                .build();
    }
}