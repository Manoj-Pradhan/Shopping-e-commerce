package com.example.jazzy_kart.service;

import com.example.jazzy_kart.impl.IOrderItemService;
import com.example.jazzy_kart.model.OrderItem;
import com.example.jazzy_kart.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemService implements IOrderItemService {
    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public OrderItem saveOrederItem(OrderItem orderItem){
        return orderItemRepository.save(orderItem);
    }

    @Override
    public List<OrderItem> getAllOrderItem(){
        return orderItemRepository.findAll();
    }

    @Override
    public OrderItem getOrderItemById(long id){
        return orderItemRepository.findById(id).orElse(null);
    }

    @Override
    public OrderItem updateOrderItem(Long id, OrderItem orderItemDetails){
        return orderItemRepository.findById(id)
                .map(orderItem -> {
                    orderItem.setOrderId(orderItemDetails.getOrderId());
                    orderItem.setProductId(orderItemDetails.getProductId());
                    orderItem.setProductName(orderItemDetails.getProductName());
                    orderItem.setProductPrice(orderItemDetails.getProductPrice());
                    orderItem.setQuantity(orderItemDetails.getQuantity());
                    return orderItemRepository.save(orderItem);
                }).orElse(null);
    }

    @Override
    public void deleteOrderItem(Long id){
        orderItemRepository.deleteById(id);
    }

}
