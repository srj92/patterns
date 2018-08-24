package com.gof.patterns.behaviour.chainofresponsibility.orderhandler;

import com.gof.patterns.behaviour.chainofresponsibility.request.OrderRequest;

public class NonVegOrderHandler extends OrderHandler {

    @Override
    public void handle(OrderRequest orderRequest) {
        if (OrderType.NONVEG_ORDER.equals(orderRequest.getOrderType())) {
            System.out.println("Handling non veg order: " + orderRequest.getOrderMessage());
            return;
        }
        handleNext(orderRequest);
    }
    
}