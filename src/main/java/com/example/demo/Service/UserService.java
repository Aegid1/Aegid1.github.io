package com.example.demo.Service;
import com.example.demo.*;
import com.example.demo.Daos.UserDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.UserEntity;

@Service
public class UserService {
    
    private final UserDAO dao;

    @Autowired
    public UserService(UserDAO dao){ this.dao = dao; }

    public UserEntity createUserId(UserEntity user){

        Long max = dao.getMaxUserID();
        user.setId(max);
        return user;
    }

    public UserEntity addUser(UserEntity user){
        return dao.addUser(user);
    }

    
}
