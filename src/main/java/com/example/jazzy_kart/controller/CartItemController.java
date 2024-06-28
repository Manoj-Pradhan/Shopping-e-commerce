package com.example.jazzy_kart.controller;

import com.example.jazzy_kart.model.CartItem;
import com.example.jazzy_kart.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value ="/api")
public class CartItemController {

    @Autowired
    private CartItemService cartItemService;

    @PostMapping("cartItems")
    public CartItem saveCartItem(@RequestBody CartItem cartItem) {
        return cartItemService.saveCartItem(cartItem);
    }

    @GetMapping("/cartItems")
    public List<CartItem> getAllCartItems() {
        return cartItemService.getAllCartItems();
    }

    @GetMapping("/cartItems/{id}")
    public CartItem getCartItemById(@PathVariable Long id) {
        return cartItemService.getCartItemById(id);
    }

    @PutMapping("/cartItems/{id}")
    public CartItem updateCartItem(@PathVariable Long id, @RequestBody CartItem cartItemDetails) {
        return cartItemService.updateCartItem(id, cartItemDetails);
    }

    @DeleteMapping("/cartItems/{id}")
    public void deleteCartItem(@PathVariable Long id) {
        cartItemService.deleteCartItem(id);
    }
}
