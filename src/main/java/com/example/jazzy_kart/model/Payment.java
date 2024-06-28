package com.example.jazzy_kart.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long productId; // The ID of the product being purchased
    private double amount; // The amount of the payment
    private String paymentType; // The payment method used (e.g., credit card, PayPal)
    private Long cardNumber; // The card number
    private String cvv; // The card number
    // Constructors, Getters and Setters
}
