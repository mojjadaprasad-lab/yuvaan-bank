package com.org.yuvaan.bank.repository;

import com.org.yuvaan.bank.entity.CustomerPersonalDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerPersonalDetailsRepository extends JpaRepository<CustomerPersonalDetailsEntity,Long> {
}
