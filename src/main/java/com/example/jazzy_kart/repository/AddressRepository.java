package com.example.jazzy_kart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jazzy_kart.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
    
}
