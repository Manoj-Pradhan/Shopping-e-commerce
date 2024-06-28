package com.example.jazzy_kart.impl;

import com.example.jazzy_kart.model.Cart;
import com.example.jazzy_kart.model.CartItem;

import java.util.List;

public interface ICartItemService {

    CartItem saveCartItem(CartItem cartItem);

    List<CartItem> getAllCartItems();

    CartItem getCartItemById(Long id);

    CartItem updateCartItem(Long id, CartItem cartItemDetails);
}
