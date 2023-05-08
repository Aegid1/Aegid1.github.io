package com.example.demo.Service;

import java.io.Serial;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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


    public void addUser(String firstname, String lastname, String password, String country, String city, String postalcode, String address, String email){

        String sql = new StringBuffer()
                    .append("INSERT INTO user_account (user_id, firstname, lastname, password, country, city, postalcode, address, email)")
                    .append("VALUES (DEFAULT, ?, ?, ?, ?, ?, ?, ?, ?)")
                    .toString();

        try(PreparedStatement ps = conn.prepareStatement(sql)){

            ps.setString(1, firstname);
            ps.setString(2, lastname);
//eventuell hier noch abfragen ob passwort gut genug ist
            ps.setString(3, password);
//eventuell hier abfragen ob Land wirklich existiert
            ps.setString(4, country);
            ps.setString(5, city);
            ps.setString(6, postalcode);
            ps.setString(7, address);
//eventuell hier noch abfragen ob gültige email -> enthält es ein "@"?, usw.
            ps.setString(8, email);
            ps.executeUpdate();
        
//Exception eventuell noch anpassen
        } catch (SQLException e) {

            System.out.println("Ausführung gescheitert!");

        }          

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
