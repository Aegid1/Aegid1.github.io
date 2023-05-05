package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @Autowired
    UserService uService;

    @PostMapping("/user")
    public User createUser(String firstname, String lastname, String email, String password){

        return uService.saveUser(new User(firstname, lastname, email, password));

    }

    @GetMapping("/user/{id}")
    public String getUserName(Long id){

        return uService.getUser(id).getFirstname();
        
    }

}
