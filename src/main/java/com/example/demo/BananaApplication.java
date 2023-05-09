package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.Service.DBService;

@SpringBootApplication
public class BananaApplication {


	public static void main(String[] args) {
		
		DBService bananaPie = new DBService();
		
		bananaPie.connect();
		//UserController uController = new UserController();
		//uController.demo();
		SpringApplication.run(BananaApplication.class, args);
		
	}

}
