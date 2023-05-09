package com.example.demo.Controller;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Entity.UserEntity;
import com.example.demo.Service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
    
    private UserService uService;

    public UserController(UserService uService){
        this.uService = uService;
    }

    @GetMapping("/registration")
    public String demo(){   

        return "registerForm";
    
    }

    @PostMapping("/user")
    public ResponseEntity<Void> createUser(@RequestBody UserEntity user) throws URISyntaxException{
        user = uService.addUser(user);
        URI uri = new URI("/users/user/" + user.getId());
        
        return ResponseEntity.created(uri).build(); 

    }

    // @GetMapping("/user/{id}")
    // public String getUserName(Long id){
// 
        // return uService.getUser(id).getFirstname();
        // 
    // }

}
