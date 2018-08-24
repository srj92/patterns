package com.gof.patterns.behaviour.chain_of_responsibility;

import com.gof.patterns.behaviour.chain_of_responsibility.order_handler.OrderHandler.OrderType;

public final class OrderRequest {

    private final OrderType orderType;
    private final String orderMessage;
    private final String orderAddress;
    
    private OrderRequest(OrderType orderType, String orderMessage, String orderAddress) {
        super();
        this.orderType = orderType;
        this.orderMessage = orderMessage;
        this.orderAddress = orderAddress;
    }

    public static OrderRequest buildNewOrder(OrderType orderType, String orderMessage, String orderAddress) {
        OrderRequest orderRequest = new OrderRequest(orderType, orderMessage, orderAddress);
        return orderRequest;
    }
    
    public OrderType getOrderType() {
        return orderType;
    }

    public String getOrderMessage() {
        return orderMessage;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("OrderRequest [orderType=").append(orderType).append(", orderMessage=").append(orderMessage)
                .append(", orderAddress=").append(orderAddress).append("]");
        return builder.toString();
    }
    
}