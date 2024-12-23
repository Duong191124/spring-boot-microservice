package com.example.product_service_api.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductResponse {
    private String productName;
    private long productId;
    private int quantity;
    private double price;
}
