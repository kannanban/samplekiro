package com.example.batchapi.service;

import com.example.batchapi.model.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public String createOrder(Order o) {
        return "Order created for item: " + o.getItem();
    }

    public String getOrder(Long id) {
        return "Order details for id: " + id;
    }
}
