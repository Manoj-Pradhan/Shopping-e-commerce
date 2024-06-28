package com.example.jazzy_kart.impl;

import com.example.jazzy_kart.model.Order;

import java.util.List;

public interface IOrderService {

    Order saveOrder(Order order);

    List<Order> getAllOrders();

    Order getOrderById(Long id);

    Order updateOrder(Long id, Order orderDetails);

    void deleteOrder(Long id);
}
