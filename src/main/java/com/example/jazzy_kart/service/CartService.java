package com.example.jazzy_kart.service;

import com.example.jazzy_kart.impl.ICartService;
import com.example.jazzy_kart.model.Cart;
import com.example.jazzy_kart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService implements ICartService {

    @Autowired
    private CartRepository cartRepository;

//    @Override
//    public Cart saveCartItem(Cart cartItem) {
//        return null;
//    }

    @Override
    public Cart saveCart(Cart cart) {
        return cartRepository.save(cart);
    }

//    @Override
//    public List<Cart> getAllCartItems() {
//        return null;
//    }

    @Override
    public List<Cart> getAllCarts() {
        return cartRepository.findAll();
    }

//    @Override
//    public Cart getCartItemById(Long id) {
//        return null;
//    }

    @Override
    public Cart getCartById(Long id) {
        return cartRepository.findById(id).orElse(null);
    }

    @Override
    public Cart updateCart(Long id, Cart cartDetails){
        return cartRepository.findById(id)
                .map(cart -> {
                    cart.setProductName(cartDetails.getProductName());
                    cart.setProductPrice(cartDetails.getProductPrice());
                    cart.setProductQuantity(cartDetails.getProductQuantity());
                    return cartRepository.save(cart);
                })
                .orElse(null);
    }

    @Override
    public void deleteCart(Long id) {
        cartRepository.deleteById(id);
    }
}
