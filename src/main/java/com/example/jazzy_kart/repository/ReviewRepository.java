package com.example.jazzy_kart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jazzy_kart.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
