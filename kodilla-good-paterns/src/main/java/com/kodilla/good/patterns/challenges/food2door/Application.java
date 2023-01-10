package com.kodilla.good.patterns.challenges.food2door;



public class Application {

    public static void main(String[] args){
        FoodRequestRetriever foodRequestRetriever = new FoodRequestRetriever();
        OrderRequest orderRequest = foodRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.order(orderRequest);
    }
}
