package com.example.order_service_api.service;

import com.example.order_service_api.entity.Order;
import com.example.order_service_api.model.OrderRequest;
import com.example.order_service_api.model.OrderResponse;

public interface OrderService {
    Order placeOrder(OrderRequest orderRequest);

    OrderResponse getOrderDetails(long orderId);
}
