package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    UserService uService;


    @GetMapping("/")
    public String demo(){   

        return "/home/aegidiushaslauer/Banana/Banana/src/main/resources/static/registerForm.html";
    
    }

    @PostMapping("/create")
    public User createUser(String firstname, String lastname, String email, String password){
        
        return uService.saveUser(new User(firstname, lastname, email, password));

    }

    @GetMapping("/get/{id}")
    public String getUserName(Long id){

        return uService.getUser(id).getFirstname();
        
    }

}
