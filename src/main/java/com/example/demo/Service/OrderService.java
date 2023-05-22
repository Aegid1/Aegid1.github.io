package com.example.demo.Service;

import com.example.demo.Daos.OrderDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    
    private final OrderDAO dao;

    @Autowired
    public OrderService(OrderDAO dao){ this.dao = dao; }
    
}
