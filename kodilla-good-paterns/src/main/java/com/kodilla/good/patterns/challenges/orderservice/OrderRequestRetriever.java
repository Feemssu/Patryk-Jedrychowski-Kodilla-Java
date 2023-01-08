package com.kodilla.good.patterns.challenges.orderservice;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){
        User user = new User("Sara", "Walker");

        Product product = new Product("Phone", "Apple - iPhone 13", 4599);

        LocalDateTime dateOrder = LocalDateTime.of(2023, 1, 7, 22, 05);
        LocalDateTime dateDelivery = LocalDateTime.of(2023, 1, 11, 10, 00);

        return new OrderRequest(user, product, dateOrder, dateDelivery);
    }
}
