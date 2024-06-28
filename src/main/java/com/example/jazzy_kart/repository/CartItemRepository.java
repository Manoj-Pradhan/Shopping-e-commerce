package com.example.jazzy_kart.repository;

import com.example.jazzy_kart.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long>  {
}
