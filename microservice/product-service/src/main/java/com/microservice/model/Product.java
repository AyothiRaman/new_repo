package com.microservice.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(value = "product-details")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Product {
    private int id;
    private String name;
    private String description;
    private BigDecimal price;
}
