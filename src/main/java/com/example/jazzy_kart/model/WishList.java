package com.example.jazzy_kart.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "wishList")
public class WishList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userId;
    private String productId;
    private String productName;
    private String productImage;
    private int productPrice;
    private int productQuantity;
    private int discount;
    private int totalPrice;
}
