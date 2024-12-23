package com.example.order_service_api.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderRequest {
    private long productId;
    private double totalAmount;
    private int quantity;
    private PaymentMode paymentMode;
}
