package com.org.yuvaan.bank.services;

import com.org.yuvaan.bank.entity.CustomerPersonalDetailsEntity;
import com.org.yuvaan.bank.repository.CustomerPersonalDetailsRepository;

import java.util.List;

public interface CustomerPersonalDetailsService {
    CustomerPersonalDetailsEntity saveCustomerDetails(CustomerPersonalDetailsEntity customerPersonalDetailsEntity);
    List<CustomerPersonalDetailsEntity> getCustomerDetails();
}
