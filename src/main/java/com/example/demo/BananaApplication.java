package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class BananaApplication {


	public static void main(String[] args) {
		
		DBService bananaPie = new DBService();
		bananaPie.connect();
		SpringApplication.run(BananaApplication.class, args);

	}

}
