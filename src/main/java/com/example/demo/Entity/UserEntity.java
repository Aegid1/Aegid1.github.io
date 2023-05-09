package com.example.demo.Entity;

import javax.persistence.*;

public class UserEntity {

//eventuell noch Reihenfolge ändern

    public UserEntity(String firstname, 
                      String lastname, 
                      String password, 
                      String country, 
                      String city, 
                      String postalcode, 
                      String address, 
                      String email){

        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.country = country;
        this.city = city;
        this.postalcode = postalcode;
        this.address = address;
        this.email = email;

    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private String password;
    private String country;
    private String city;
    private String postalcode;
    private String address;
    private String email;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    


}
