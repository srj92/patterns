package com.gof.patterns.behaviour.chain_of_responsibility.order_handler;

import com.gof.patterns.behaviour.chain_of_responsibility.OrderRequest;

public abstract class OrderHandler {

    private OrderHandler nextHandler;
    
    public enum OrderType {
        VEG_ORDER, NONVEG_ORDER, DRINKS_ORDER; 
    }
    
    public void setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    
    public abstract void handle(OrderRequest orderRequest);
    
    public void handleNext(OrderRequest orderRequest) {
        nextHandler.handle(orderRequest);
    }
}
