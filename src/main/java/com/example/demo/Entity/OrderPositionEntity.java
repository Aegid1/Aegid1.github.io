package com.example.demo.Entity;

public class OrderPositionEntity {
    
    private Long orderPositionID;
    private Long orderID;
    private Long productID;
    private int amount;

    public OrderPositionEntity(){ }

    public OrderPositionEntity(int amount){
        this.amount = amount;
    }

    public Long getOrderPositionID() {
        return orderPositionID;
    }

    public Long getOrderID() {
        return orderID;
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

    
}
