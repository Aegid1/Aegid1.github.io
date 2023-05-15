package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.Daos.CartDAO;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    
    private final CartDAO dao;

    @Autowired
    public CartService(CartDAO dao){ this.dao = dao; }
}
