package com.example.jazzy_kart.impl;

import com.example.jazzy_kart.model.Payment;

import java.util.List;

public interface IPaymentService {

    Payment savePayment(Payment payment);

    List<Payment> getAllPayments();

    Payment getPaymentById(Long id);

    void deletePayment(Long id);
}
