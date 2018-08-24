package com.gof.patterns.behaviour.chain_of_responsibility.order_handler;

import com.gof.patterns.behaviour.chain_of_responsibility.OrderRequest;

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
