package com.example.jazzy_kart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jazzy_kart.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
