package com.example.jazzy_kart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jazzy_kart.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
