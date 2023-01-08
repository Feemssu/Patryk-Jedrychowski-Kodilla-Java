package com.kodilla.good.patterns.challenges.orderservice;

import java.time.LocalDateTime;

public interface OrderRepository {

    boolean createOrder(final User user, final Product product, final LocalDateTime dateOrder, final LocalDateTime dateDelivery);
}
