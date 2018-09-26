package com.gof.patterns.behaviour.chainofresponsibility;

import com.gof.patterns.behaviour.chainofresponsibility.orderhandler.OrderHandlerBuilder;
import com.gof.patterns.behaviour.chainofresponsibility.request.OrderRequest;
import com.gof.patterns.behaviour.chainofresponsibility.orderclient.OrderClient;
import com.gof.patterns.behaviour.chainofresponsibility.orderhandler.OrderHandler;

public class Main {
    
    public static void main(String[] args) {
        OrderHandler orderHandler = OrderHandlerBuilder.buildOrderHandlerChain();
        OrderClient orderClient = new OrderClient(orderHandler);
        OrderRequest orderRequest = OrderRequest.buildNewOrder(OrderHandler.OrderType.DRINKS_ORDER, "Coke", "abc");
        orderClient.sendOrder(orderRequest);

        orderRequest = OrderRequest.buildNewOrder(OrderHandler.OrderType.NONVEG_ORDER, "Chicken", "abc");
        orderClient.sendOrder(orderRequest);

        orderRequest = OrderRequest.buildNewOrder(OrderHandler.OrderType.VEG_ORDER, "salad", "abc");
        orderClient.sendOrder(orderRequest);
    }
    
}
