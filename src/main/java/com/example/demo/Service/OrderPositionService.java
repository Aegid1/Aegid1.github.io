package com.example.demo.Service;

import com.example.demo.Daos.OrderPositionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderPositionService {
    
    private final OrderPositionDAO dao;

    @Autowired
    public OrderPositionService(OrderPositionDAO dao){ this.dao = dao; }
}
