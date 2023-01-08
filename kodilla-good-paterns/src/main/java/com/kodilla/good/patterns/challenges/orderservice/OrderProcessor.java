package com.kodilla.good.patterns.challenges.orderservice;

public class OrderProcessor {

    private final InformationService informationService;
    private final ProductOrderService productOrderService;
    private final ProductOrderRepository productOrderRepository;

    public OrderProcessor(final InformationService informationService, final ProductOrderService productOrderService, final ProductOrderRepository productOrderRepository){
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.productOrderRepository = productOrderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest){
        boolean isOrdered = productOrderService.order(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getDateOrder(), orderRequest.getDateDelivery());
        if(isOrdered){
            informationService.info(orderRequest.getUser());
            productOrderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getDateOrder(), orderRequest.getDateDelivery());
            return new OrderDto(orderRequest.getUser(), true);
        }else{
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
