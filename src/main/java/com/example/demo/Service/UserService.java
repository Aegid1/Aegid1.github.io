package com.example.demo.Service;
import com.example.demo.*;
import com.example.demo.Daos.UserDAO;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.UserEntity;

@Service
public class UserService {
    
    private final JdbcTemplate jdbctemplate;
    private UserDAO userDAO;

    public UserService(JdbcTemplate jdbc){ 
        this.jdbctemplate = jdbc;
    }

    public UserEntity createUserId(UserEntity user){

        Long max = userDAO.getMaxUserID();
        user.setId(max);
        return user;
    }

    public UserEntity addUser(UserEntity user){
        return userDAO.addUser(user);
    }

    
}
