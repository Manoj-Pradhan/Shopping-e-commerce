package com.example.jazzy_kart.controller;

import com.example.jazzy_kart.model.Cart;
import com.example.jazzy_kart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/carts")
    public Cart saveCartItem(@RequestBody Cart cart) {
        return cartService.saveCart(cart);
    }

    @GetMapping("/carts")
    public List<Cart> getAllCart() {
        return cartService.getAllCarts();
    }

    @GetMapping("/carts/{id}")
    public Cart getCartItemById(@PathVariable Long id) {
        return cartService.getCartById(id);
    }


    @PutMapping("/carts/{id}")
    public Cart updateCart(@PathVariable Long id, @RequestBody Cart cartDetails){
        return cartService.updateCart(id, cartDetails);
    }

    @DeleteMapping("/carts/{id}")
    public void deleteCartItem(@PathVariable Long id) {
        cartService.deleteCart(id);
    }

}
