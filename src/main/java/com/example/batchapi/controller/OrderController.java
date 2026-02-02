package com.example.batchapi.controller;

import com.example.batchapi.model.Order;
import com.example.batchapi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping
    public String create(@RequestBody Order order) {
        return service.createOrder(order);
    }

    @GetMapping("/{id}")
    public String get(@PathVariable Long id) {
        return service.getOrder(id);
    }
}
