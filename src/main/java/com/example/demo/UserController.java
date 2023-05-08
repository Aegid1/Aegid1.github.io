package com.example.demo;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.UserEntity;
import com.example.demo.Service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserService uService = new UserService();

    public UserController(UserService uService){
        this.uService = uService;
    }

    @GetMapping("/registration")
    public String demo(){   

        return "registerForm";
    
    }

    @PostMapping("/user")
    public ResponseEntity<Void> createUser(@RequestBody UserCreateRequest userRequest) throws URISyntaxException{
        var user = uService.saveUser(userRequest);
        URI uri = new URI("/user/" + user.getId());
        
        return ResponseEntity.created(uri).build(); 

    }

    @GetMapping("/user/{id}")
    public String getUserName(Long id){

        return uService.getUser(id).getFirstname();
        
    }

}
