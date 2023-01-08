package com.kodilla.good.patterns.challenges.orderservice;

import java.time.LocalDateTime;

public interface OrderService {
    boolean order(final User user,final Product product,final LocalDateTime dateOrder,final LocalDateTime dateDelivery);
}
