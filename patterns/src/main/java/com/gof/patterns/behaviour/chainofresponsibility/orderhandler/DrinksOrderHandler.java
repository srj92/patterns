package com.gof.patterns.behaviour.chainofresponsibility.orderhandler;

import com.gof.patterns.behaviour.chainofresponsibility.OrderRequest;

public class DrinksOrderHandler extends OrderHandler{

    @Override
    public void handle(OrderRequest orderRequest) {
        if (OrderType.DRINKS_ORDER.equals(orderRequest.getOrderType())) {
            System.out.println("Handling drinks order: " + orderRequest.getOrderMessage());
            return;
        }
        handleNext(orderRequest);
    }

}