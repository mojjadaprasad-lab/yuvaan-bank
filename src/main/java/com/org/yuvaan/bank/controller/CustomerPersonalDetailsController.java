package com.org.yuvaan.bank.controller;

import com.org.yuvaan.bank.entity.CustomerPersonalDetailsEntity;
import com.org.yuvaan.bank.services.CustomerPersonalDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer-details")
public class CustomerPersonalDetailsController {
    @Autowired
    private CustomerPersonalDetailsService customerPersonalDetailsService;
    //Saving the Customer Details
    @PostMapping("/add")
    public ResponseEntity<CustomerPersonalDetailsEntity> addCustomerDetails(@RequestBody CustomerPersonalDetailsEntity customerPersonalDetailsEntity){
        CustomerPersonalDetailsEntity savedEntity = customerPersonalDetailsService.saveCustomerDetails(customerPersonalDetailsEntity);
        return ResponseEntity.ok(savedEntity);
    }
    //Fetching the all customerDetails
    @GetMapping("/all")
    public ResponseEntity<List<CustomerPersonalDetailsEntity>> getAllCustomerDetails(){
        List<CustomerPersonalDetailsEntity> getAllCustomerData=customerPersonalDetailsService.getCustomerDetails();
        return ResponseEntity.ok(getAllCustomerData);
    }

}
