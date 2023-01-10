package com.kodilla.good.patterns.challenges.food2door;

public class Product {

    private String productName;
    private int productQuantity;
    private double productPrize;


    public Product(String productName, int productQuantity, double productPrize) {
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productPrize = productPrize;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public double getProductPrize() {
        return productPrize;
    }
}
