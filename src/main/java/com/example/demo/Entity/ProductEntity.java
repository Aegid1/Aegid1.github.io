package com.example.demo.Entity;

public class ProductEntity {
    
    private Long productId;
    private String productName;
    //-> eventuell hier zu BigDecimal ändern
    private double price;
    //-> eventuell hier ENUM verwenden
    private String Status;
    private String image;

    public ProductEntity(String name, double price, String status, String image){

        this.productName = name;
        this.price = price;
        this.Status = status;
        this.image = image;
        
    }



    public Long getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }



    public String getImage() {
        return image;
    }



    public void setImage(String image) {
        this.image = image;
    }

        

}
