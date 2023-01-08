package com.kodilla.good.patterns.challenges.orderservice;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {

    @Override
    public boolean order(final User user, final Product product, final LocalDateTime dateOrder, final LocalDateTime dateDelivery){
        System.out.println(user.getName() + " " + user.getSurname() + " " + dateOrder.toString() + " you bought " + product.getProductName() + " from category " + product.getCategory()
        + " for " + product.getPrice() + " złoty. Delivery time: " + dateDelivery.toString());

        return true;
    }
}
