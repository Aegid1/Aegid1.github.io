package com.example.demo.Entity;

public class CartEntity {
    
    private Long cartID;
    private Long userID;
    //eventuell hier Datentyp anpassen
    private String creationDate;
    private Long productID;
    private int amount;
    private double price;

    public CartEntity(){ }

    public CartEntity(String creationDate, int amount, double price){

        this.creationDate = creationDate;
        this.amount = amount;
        this.price = price;
    }

    public Long getCartID() {
        return cartID;
    }

    public Long getUserID() {
        return userID;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Long getProductID() {
        return productID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
}
