package com.example.jazzy_kart.controller;

import com.example.jazzy_kart.model.OrderItem;
import com.example.jazzy_kart.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class OrderItemController {

    @Autowired
    private OrderItemService orderItemService;

    @PostMapping("/OrderItems")
    public OrderItem saveOrderItem(@RequestBody OrderItem orderItem){
        return orderItemService.saveOrederItem(orderItem);
    }

    @GetMapping("/OrderItems")
    public List<OrderItem> getAllOrderItems(){
        return orderItemService.getAllOrderItem();
    }

    @GetMapping("/OrderItems/{id}")
    public OrderItem getOrderItemById(@PathVariable Long id){
        return orderItemService.getOrderItemById(id);
    }

    @PutMapping("/OrderItems/{id}")
    public OrderItem updateOrderItem(@PathVariable Long id, @RequestBody OrderItem orderItemDetails){
        return orderItemService.updateOrderItem(id, orderItemDetails);
    }
    @DeleteMapping("/OrderItems/{id}")
    public void deleteOrderItem(@PathVariable Long id){
        orderItemService.deleteOrderItem(id);
    }
}
