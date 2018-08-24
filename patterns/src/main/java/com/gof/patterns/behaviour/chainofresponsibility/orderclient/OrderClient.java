package com.gof.patterns.behaviour.chainofresponsibility.orderclient;

import com.gof.patterns.behaviour.chainofresponsibility.OrderRequest;
import com.gof.patterns.behaviour.chainofresponsibility.orderhandler.OrderHandler;

public class OrderClient {

    private OrderHandler orderHandler;
    
    public OrderClient(OrderHandler orderHandler) {
        this.orderHandler = orderHandler;
    }

    public void sendOrder(OrderRequest orderRequest) {
        orderHandler.handle(orderRequest);
    }
    
}
