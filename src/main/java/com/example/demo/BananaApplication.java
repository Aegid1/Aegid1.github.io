package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class BananaApplication {

	private final String url = System.getenv("POSTGRESQL_URL");
	private final String user = System.getenv("POSTGRESQL_USERNAME");
	private final String password = System.getenv("POSTGRESQL_PASSWORD");

	public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }


	public static void main(String[] args) {
		
		BananaApplication bananaPie = new BananaApplication();
		bananaPie.connect();
		SpringApplication.run(BananaApplication.class, args);

	}

}
