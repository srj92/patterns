package com.gof.patterns.behaviour.chainofresponsibility.orderhandler;

import com.gof.patterns.behaviour.chainofresponsibility.orderhandler.DrinksOrderHandler;
import com.gof.patterns.behaviour.chainofresponsibility.orderhandler.NonVegOrderHandler;
import com.gof.patterns.behaviour.chainofresponsibility.orderhandler.OrderHandler;
import com.gof.patterns.behaviour.chainofresponsibility.orderhandler.VegOrderHandler;

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