package com.example.jazzy_kart.impl;

import com.example.jazzy_kart.model.Cart;

import java.util.List;

public interface ICartService {



    Cart saveCart(Cart cart);


    List<Cart> getAllCarts();


    Cart getCartById(Long id);

    Cart updateCart(Long id, Cart cartDetails);


    void deleteCart(Long id);
}
