package com.org.yuvaan.bank.controller;

import com.org.yuvaan.bank.entity.CustomerPersonalDetailsEntity;
import com.org.yuvaan.bank.services.CustomerPersonalDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer-details")
public class CustomerPersonalDetailsController {
    @Autowired
    private CustomerPersonalDetailsService customerPersonalDetailsService;
    @PostMapping("/add")
    public ResponseEntity<CustomerPersonalDetailsEntity> addCustomerDetails(@RequestBody CustomerPersonalDetailsEntity customerPersonalDetailsEntity){
        CustomerPersonalDetailsEntity savedEntity = customerPersonalDetailsService.saveCustomerDetails(customerPersonalDetailsEntity);
        return ResponseEntity.ok(savedEntity);
    }
}
