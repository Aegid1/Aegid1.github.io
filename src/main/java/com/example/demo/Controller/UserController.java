package com.example.demo.Controller;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.UserEntity;
import com.example.demo.Service.UserService;

@RestController
@CrossOrigin(origins = "https://github.com/Aegid1/Aegid1.github.io/tree/main/src/main/resources/templates")
public class UserController {
    
    private UserService uService;

    public UserController(UserService uService){
        this.uService = uService;
    }

    @PostMapping("users")
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
