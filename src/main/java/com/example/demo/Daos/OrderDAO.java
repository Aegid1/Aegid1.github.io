package com.example.demo.Daos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDAO {
    
    @Autowired
    private final JdbcTemplate jdbctemplate;

    public OrderDAO(JdbcTemplate jdbctemplate){ 
        this.jdbctemplate = jdbctemplate;
    }
}
