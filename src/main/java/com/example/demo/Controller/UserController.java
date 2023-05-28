package com.example.demo.Controller;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.UserEntity;
import com.example.demo.Service.UserService;

@RestController
@CrossOrigin(origins = "https://Aegid1.github.io")
public class UserController {
    
    private UserService uService;

    public UserController(UserService uService){
        this.uService = uService;
    }

    @PostMapping("/users")
    public ResponseEntity<String> createUser(@RequestBody UserEntity user) throws URISyntaxException{

        //checks if the email already exists
        if(uService.checkEmail(user) == false){ return ResponseEntity.badRequest().body("The email already exists."); }
        
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
