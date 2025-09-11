package com.tradingSystem.Jasdaq.Engine;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, String> {

    List<Order> findByCompanyCompanyId(String companyId);
    
}
