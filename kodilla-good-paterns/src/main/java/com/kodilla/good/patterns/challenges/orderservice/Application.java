package com.kodilla.good.patterns.challenges.orderservice;

public class Application {

    public static void main(String[] args){

        OrderRequestRetriever orderRequestRetriver = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriver.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(
                new MailService(), new ProductOrderService(), new ProductOrderRepository());
        orderProcessor.process(orderRequest);
    }
}
