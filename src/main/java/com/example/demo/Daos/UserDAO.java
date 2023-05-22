package com.example.demo.Daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.example.demo.Entity.UserEntity;

@Repository
public class UserDAO {
    
    @Autowired
    private final JdbcTemplate jdbctemplate;

    public UserDAO(JdbcTemplate jdbctemplate){ 
        this.jdbctemplate = jdbctemplate;
    }
    
    public UserEntity addUser(UserEntity user){

        String sql = new StringBuffer()
                    .append("INSERT INTO user_account (user_id, firstname, lastname, password, country, city, postalcode, address, email)")
                    .append("VALUES (DEFAULT, ?, ?, ?, ?, ?, ?, ?, ?)")
                    .toString();

       jdbctemplate.update(sql, user.getFirstname(), 
                                user.getLastname(), 
                                user.getPassword(), 
                                user.getCountry(), 
                                user.getCity(), 
                                user.getPostalcode(), 
                                user.getAddress(), 
                                user.getEmail());

        return user;

    }

    public Long getMaxUserID(){

        String sql = "SELECT MAX(user_id) FROM user_account";  
        Long max = jdbctemplate.queryForObject(sql, Long.class); 

        return max;
    }

    public void updateUsername(Long id, String updatedName){

        String sql = "UPDATE user_account SET firstname = ? WHERE user_id = ?";
        jdbctemplate.update(sql, updatedName, id);
 
    }

    public void updateEmail(Long id, String updatedEmail){

        String sql = "UPDATE user_account SET email = ? WHERE user_id = ?";
        jdbctemplate.update(sql, updatedEmail, id);

    }

    public List<String> getAllEmails(){

        String sql = "SELECT email FROM user_account";
        List<String> email = jdbctemplate.queryForList(sql, String.class); 

        return email;        
    }
}
