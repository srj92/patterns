package com.gof.patterns.behaviour.chain_of_responsibility.order_handler;

import com.gof.patterns.behaviour.chain_of_responsibility.order_handler.DrinksOrderHandler;
import com.gof.patterns.behaviour.chain_of_responsibility.order_handler.NonVegOrderHandler;
import com.gof.patterns.behaviour.chain_of_responsibility.order_handler.OrderHandler;
import com.gof.patterns.behaviour.chain_of_responsibility.order_handler.VegOrderHandler;

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