package com.gof.patterns.behaviour.chain_of_responsibility;

import com.gof.patterns.behaviour.chain_of_responsibility.order_client.OrderClient;
import com.gof.patterns.behaviour.chain_of_responsibility.order_handler.OrderHandler;
import com.gof.patterns.behaviour.chain_of_responsibility.order_handler.OrderHandler.OrderType;
import com.gof.patterns.behaviour.chain_of_responsibility.order_handler.OrderHandlerBuilder;

public class Main {
    
    public static void main(String[] args) {
        OrderHandler orderHandler = OrderHandlerBuilder.buildOrderHandlerChain();
        OrderClient orderClient = new OrderClient(orderHandler);
        OrderRequest orderRequest = OrderRequest.buildNewOrder(OrderType.DRINKS_ORDER, "Coke", "abc"); 
        orderClient.sendOrder(orderRequest);
        
        orderRequest = OrderRequest.buildNewOrder(OrderType.NONVEG_ORDER, "Chicken", "abc"); 
        orderClient.sendOrder(orderRequest);
        
        orderRequest = OrderRequest.buildNewOrder(OrderType.VEG_ORDER, "salad", "abc"); 
        orderClient.sendOrder(orderRequest);
    }
    
}
