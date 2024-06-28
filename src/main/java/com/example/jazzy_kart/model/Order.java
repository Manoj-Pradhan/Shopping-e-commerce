package com.example.jazzy_kart.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 4, message = "Customer name must contain at least 4 characters")
    private String customerName;

    @NotBlank
    @Size(min = 5, message = "Product name must contain at least 5 characters")
    private String product;

    private int quantity;
    private double discount;
    private double productPrice;
    private double totalPrice;
//    private List<Product> products;
}
