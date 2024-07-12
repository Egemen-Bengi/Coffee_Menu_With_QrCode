package com.example.firstWebJava.entity;

public class Product {
    private int productID;
    private String productClass;
    private String productName;
    private int productPrice;

    public Product(String productClass, String productName, int productPrice){
        this.productClass = productClass;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Product(){}

    public int getProductID() {
        return productID;
    }

    public String getProductClass() {
        return productClass;
    }

    public void setProductClass(String productClass) {
        this.productClass = productClass;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
}
