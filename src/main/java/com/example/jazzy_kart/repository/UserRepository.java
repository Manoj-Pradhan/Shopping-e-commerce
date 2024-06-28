package com.example.jazzy_kart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jazzy_kart.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
