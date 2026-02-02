package com.example.batchapi.service;

import com.example.batchapi.model.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public String createCustomer(Customer c) {
        return "Customer created: " + c.getName();
    }

    public String getCustomer(Long id) {
        return "Customer details for id: " + id;
    }
}
