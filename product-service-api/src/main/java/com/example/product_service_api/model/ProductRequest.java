package com.example.product_service_api.model;

import lombok.Data;

@Data
public class ProductRequest {
    private String name;
    private long price;
    private int quantity;
}
