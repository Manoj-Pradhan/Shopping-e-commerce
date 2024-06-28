package com.example.jazzy_kart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jazzy_kart.model.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole,Long> {
    
}
