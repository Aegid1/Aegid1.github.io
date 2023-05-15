package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BananaApplication {

	public static void main(String[] args) {
		
		//ConfigurableApplicationContext context = SpringApplication.run(BananaApplication.class, args);

		//UserService uService = context.getBean(UserService.class);
		// UserEntity user1 = new UserEntity("hey", "was", "geht", "ab", "du", "stecher", "yippie", ".");
		// uService.createUserId(user1);
		// uService.addUser(user1);
		SpringApplication.run(BananaApplication.class, args);
		
	}

}
