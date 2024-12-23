package com.example.product_service_api.service;

import com.example.product_service_api.entity.Product;
import com.example.product_service_api.model.ProductRequest;
import com.example.product_service_api.model.ProductResponse;

public interface ProductService {
    Product addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, int quantity);
}
