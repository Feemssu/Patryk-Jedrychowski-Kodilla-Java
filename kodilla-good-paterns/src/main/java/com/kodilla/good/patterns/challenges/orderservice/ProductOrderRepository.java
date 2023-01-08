package com.kodilla.good.patterns.challenges.orderservice;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository {

    public boolean createOrder (final User user, final Product product, final LocalDateTime dateOrder, final LocalDateTime dateDelivery){
        System.out.println("Order has been added");
        return true;
    }
}
