package com.example.jazzy_kart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jazzy_kart.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
