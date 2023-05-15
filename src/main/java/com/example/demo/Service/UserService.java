package com.example.demo.Service;
import com.example.demo.Daos.UserDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.UserEntity;

@Service
public class UserService {
    
    private final UserDAO dao;

    @Autowired
    public UserService(UserDAO dao){ this.dao = dao; }

    public UserEntity addUser(UserEntity user){ return dao.addUser(user); }

    // public UserEntity createUserId(UserEntity user){
// 
        // Long max = dao.getMaxUserID();
        // user.setId(max);
        // return user;
    // }

    public UserEntity updateUsername(UserEntity user, String updatedName){ 
    
        dao.updateUsername(user.getId(), updatedName);
        return user;
    }
    
    public UserEntity updateEmail(UserEntity user, String updatedEmail){

        dao.updateEmail(user.getId(), updatedEmail);
        return user;
    }
}
