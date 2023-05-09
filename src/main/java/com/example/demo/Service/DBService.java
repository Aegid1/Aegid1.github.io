package com.example.demo.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;


public class DBService {
    
    private final String url = System.getenv("POSTGRESQL_URL");
	private final String user = System.getenv("POSTGRESQL_USERNAME");
	private final String password = System.getenv("POSTGRESQL_PASSWORD");

    @Autowired
    private Connection conn;

	public Connection connect() {
    
        try {

            conn = DriverManager.getConnection(url, user, password);

            System.out.println("Connected to the PostgreSQL server successfully.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    public void deleteUser(int id){

        String sql = ("DELETE FROM user_account WHERE user_id = ?");

        try(PreparedStatement ps = conn.prepareStatement(sql)){

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {

            System.out.println("Ausführung gescheitert!");

        }  
        
    }

    public String showInfo(int id){

        String sql = ("SELECT firstname FROM user_account WHERE user_id = ?");

        try(PreparedStatement ps = conn.prepareStatement(sql)){

            ps.setInt(1, id);

            try(ResultSet rs = ps.executeQuery()){
                if(rs.next()){ return rs.getString("firstname"); }
            }

        } catch (SQLException e) {

            return ("Ausführung gescheitert!");

        }  
        
        return "";
    }

}
