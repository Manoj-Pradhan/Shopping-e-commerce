package com.example.jazzy_kart.service;

import com.example.jazzy_kart.impl.IOrderService;
import com.example.jazzy_kart.model.Order;
import com.example.jazzy_kart.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements IOrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }
    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    @Override
    public Order updateOrder(Long id, Order orderDetails){
        return orderRepository.findById(id)
                .map(order -> {
                    order.setCustomerName(orderDetails.getCustomerName());
                    order.setProduct(orderDetails.getProduct());
                    order.setQuantity(orderDetails.getQuantity());
                    return  orderRepository.save(order);
                })
                .orElse(null);
    }

    @Override
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
