package com.example.jazzy_kart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jazzy_kart.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
