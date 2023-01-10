package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor {


    public void order(OrderRequest orderRequest){

        boolean isOrdered = orderRequest.getSupplier().process(orderRequest.getSupplier(),orderRequest.getProduct());
        if(isOrdered){
            System.out.println("Order has been sent");
        }else{
            System.out.println("Error");
        }
    }
}
