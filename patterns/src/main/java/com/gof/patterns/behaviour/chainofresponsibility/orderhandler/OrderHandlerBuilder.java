package com.gof.patterns.behaviour.chainofresponsibility.orderhandler;

public class OrderHandlerBuilder {

    public static OrderHandler buildOrderHandlerChain() {
        OrderHandler nonVegHandler = new NonVegOrderHandler();
        OrderHandler vegHandler = new VegOrderHandler();
        OrderHandler drinksHandler = new DrinksOrderHandler();
        
        nonVegHandler.setNextHandler(vegHandler);
        vegHandler.setNextHandler(drinksHandler);
        
        return nonVegHandler;
    }
    
}