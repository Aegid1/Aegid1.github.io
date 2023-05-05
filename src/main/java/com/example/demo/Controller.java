package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller{
    
    @GetMapping
    public String demo(){
        return "/home/aegidiushaslauer/Banana/Banana/src/main/resources/templates/index_test.html";
    }

}
