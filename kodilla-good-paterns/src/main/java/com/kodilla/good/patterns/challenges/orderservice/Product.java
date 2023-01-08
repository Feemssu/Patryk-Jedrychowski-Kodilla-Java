package com.kodilla.good.patterns.challenges.orderservice;

public class Product {

    private String category;
    private String productName;
    private int price;

    public Product(final String category, final String productName, final int price){
        this.category = category;
        this.productName = productName;
        this.price = price;
    }

    public String getCategory(){
        return category;
    }

    public String getProductName(){
        return productName;
    }

    public int getPrice(){
        return price;
    }
}
