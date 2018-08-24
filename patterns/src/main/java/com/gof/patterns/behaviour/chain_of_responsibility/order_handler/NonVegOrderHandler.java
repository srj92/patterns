package com.gof.patterns.behaviour.chain_of_responsibility.order_handler;

import com.gof.patterns.behaviour.chain_of_responsibility.OrderRequest;

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