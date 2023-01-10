package com.kodilla.good.patterns.challenges.food2door;

public class FoodRequestRetriever {

    public OrderRequest retrieve() {
        Supplier supplier = new Supplier("ExtraFoodShop");

        Product product = new Product("Hamburger", 5, 7.99);

        return new OrderRequest(supplier, product);
    }
}
