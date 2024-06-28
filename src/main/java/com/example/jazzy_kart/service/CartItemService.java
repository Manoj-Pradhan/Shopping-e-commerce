package com.example.jazzy_kart.service;

import com.example.jazzy_kart.impl.ICartItemService;
import com.example.jazzy_kart.model.CartItem;
import com.example.jazzy_kart.repository.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartItemService implements ICartItemService {

    @Autowired
    private CartItemRepository cartItemRepository;

    @Override
  public CartItem saveCartItem(CartItem cartItem) {
      return cartItemRepository.save(cartItem);
  }

  @Override
  public List<CartItem> getAllCartItems(){
        return cartItemRepository.findAll();
  }

  @Override
  public CartItem getCartItemById(Long id){
        return cartItemRepository.findById(id).orElse(null);
  }

  @Override
  public CartItem updateCartItem(Long id, CartItem cartItemDetails){
        return cartItemRepository.findById(id)
               .map(cartItem -> {
                    cartItem.setQuantity(cartItemDetails.getQuantity());
                    cartItem.setProductPrice(cartItemDetails.getProductPrice());
                    cartItem.setDiscount(cartItemDetails.getDiscount());
                    return cartItemRepository.save(cartItem);
                })
               .orElse(null);
  }

  public void deleteCartItem(Long id){
        cartItemRepository.deleteById(id);
  }
}
