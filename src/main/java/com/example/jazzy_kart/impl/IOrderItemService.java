package com.example.jazzy_kart.impl;

import com.example.jazzy_kart.model.OrderItem;

import java.util.List;

public interface IOrderItemService {

    OrderItem saveOrederItem(OrderItem orderItem);

    List<OrderItem> getAllOrderItem();

    OrderItem getOrderItemById(long id);

    OrderItem updateOrderItem(Long id, OrderItem orderItemDetails);

    void deleteOrderItem(Long id);
}
