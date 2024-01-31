package com.microservice.controller;

import com.microservice.dto.ProductRequest;
import com.microservice.dto.ProductResponse;
import com.microservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;


    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest request){

        productService.createProduct(request);

    }

    @GetMapping("/get")
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProductDetails(){

        return productService.getAllDetailsOfProduct();
    }
}
