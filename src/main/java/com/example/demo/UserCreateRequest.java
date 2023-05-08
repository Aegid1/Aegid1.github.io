package com.example.demo;

public class UserCreateRequest{

    public UserCreateRequest(String firstname, String lastname, String email, String password){
        
        this.firstname = firstname;
        this.lastname = lastname;
            this.email = email;
            this.password = password;
    }

    private String firstname;

    private String lastname;

    private String email;

    private String password;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }




}

