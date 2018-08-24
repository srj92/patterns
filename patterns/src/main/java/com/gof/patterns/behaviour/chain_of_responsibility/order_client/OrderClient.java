package com.gof.patterns.behaviour.chain_of_responsibility.order_client;

import com.gof.patterns.behaviour.chain_of_responsibility.OrderRequest;
import com.gof.patterns.behaviour.chain_of_responsibility.order_handler.OrderHandler;

public class OrderClient {

    private OrderHandler orderHandler;
    
    public OrderClient(OrderHandler orderHandler) {
        this.orderHandler = orderHandler;
    }

    public void sendOrder(OrderRequest orderRequest) {
        orderHandler.handle(orderRequest);
    }
    
}
