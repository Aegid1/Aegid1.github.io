package com.example.demo.Entity;

public class OrderEntity {
    
    private Long orderID;
    //eventuell hier Datentyp zu localdate ändern
    private String orderDate;
    private double totalPrice;
    private Long userID;

    public OrderEntity(){ }

    public OrderEntity(String orderDate, double price){
        this.orderDate = orderDate;
        this.totalPrice = price;
    }

    public Long getOrderID() {
        return orderID;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getUserID() {
        return userID;
    }
    
}
