package com.gof.patterns.behaviour.chainofresponsibility.orderclient;

import com.gof.patterns.behaviour.chainofresponsibility.orderhandler.OrderHandler;
import com.gof.patterns.behaviour.chainofresponsibility.request.OrderRequest;

public class OrderClient {

    private OrderHandler orderHandler;
    
    public OrderClient(OrderHandler orderHandler) {
        this.orderHandler = orderHandler;
    }

    public void sendOrder(OrderRequest orderRequest) {
        orderHandler.handle(orderRequest);
    }
    
}
