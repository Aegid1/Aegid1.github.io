package com.example.demo.Service;

import com.example.demo.Daos.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    
    private final ProductDAO dao;

    @Autowired
    public ProductService(ProductDAO dao){ this.dao = dao; }
}
