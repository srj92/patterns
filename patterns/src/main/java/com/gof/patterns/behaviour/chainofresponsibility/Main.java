package com.gof.patterns.behaviour.chainofresponsibility;

import com.gof.patterns.behaviour.chainofresponsibility.orderclient.OrderClient;
import com.gof.patterns.behaviour.chainofresponsibility.orderhandler.OrderHandler;
import com.gof.patterns.behaviour.chainofresponsibility.orderhandler.OrderHandler.OrderType;
import com.gof.patterns.behaviour.chainofresponsibility.orderhandler.OrderHandlerBuilder;
import com.gof.patterns.behaviour.chainofresponsibility.request.OrderRequest;

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
