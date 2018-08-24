package com.gof.patterns.behaviour.chainofresponsibility.orderhandler;

import com.gof.patterns.behaviour.chainofresponsibility.OrderRequest;

public class VegOrderHandler extends OrderHandler {
    
    @Override
    public void handle(OrderRequest orderRequest) {
        if (OrderType.VEG_ORDER.equals(orderRequest.getOrderType())) {
            System.out.println("Handling veg order: " + orderRequest.getOrderMessage());
            return;
        }
        handleNext(orderRequest);
    }

}
