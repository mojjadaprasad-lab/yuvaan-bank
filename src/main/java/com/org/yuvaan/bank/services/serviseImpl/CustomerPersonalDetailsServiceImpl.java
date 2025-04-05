package com.org.yuvaan.bank.services.serviseImpl;

import com.org.yuvaan.bank.entity.CustomerPersonalDetailsEntity;
import com.org.yuvaan.bank.repository.CustomerPersonalDetailsRepository;
import com.org.yuvaan.bank.services.CustomerPersonalDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerPersonalDetailsServiceImpl implements CustomerPersonalDetailsService {
@Autowired
private CustomerPersonalDetailsRepository customerPersonalDetailsRepository;
    @Override
    public CustomerPersonalDetailsEntity saveCustomerDetails(CustomerPersonalDetailsEntity customerPersonalDetailsEntity) {
        return  customerPersonalDetailsRepository.save(customerPersonalDetailsEntity);
    }

    @Override
    public CustomerPersonalDetailsEntity getCustomerDetails(CustomerPersonalDetailsEntity customerPersonalDetailsEntity) {
        return null;
    }
}
