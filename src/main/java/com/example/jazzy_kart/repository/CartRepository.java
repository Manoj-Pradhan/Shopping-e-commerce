package com.example.jazzy_kart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jazzy_kart.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

}
