package com.example.jazzy_kart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jazzy_kart.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
