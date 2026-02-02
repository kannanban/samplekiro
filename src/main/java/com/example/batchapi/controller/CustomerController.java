package com.example.batchapi.controller;

import com.example.batchapi.model.Customer;
import com.example.batchapi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @PostMapping
    public String create(@RequestBody Customer customer) {
        return service.createCustomer(customer);
    }

    @GetMapping("/{id}")
    public String get(@PathVariable Long id) {
        return service.getCustomer(id);
    }
}
