package com.example.jazzy_kart.repository;

import com.example.jazzy_kart.model.WishList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishListRepository extends JpaRepository<WishList, Long> {
}
