package com.example.jazzy_kart.service;

import com.example.jazzy_kart.impl.IWishListService;
import com.example.jazzy_kart.model.WishList;
import com.example.jazzy_kart.repository.WishListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishListService implements IWishListService {

    @Autowired
    private WishListRepository wishListRepository;

    @Override
    public WishList saveWishList(WishList wishList) {
        return wishListRepository.save(wishList);
    }

    @Override
    public List<WishList> getWishLists(){
        return wishListRepository.findAll();
    }

    @Override
    public WishList getWishListById(Long id) {
        return wishListRepository.findById(id).orElse(null);
    }

    @Override
    public WishList updateWishList(Long id, WishList wishListDetails) {
        return wishListRepository.findById(id)
               .map(wishList -> {
                    wishList.setProductId(wishListDetails.getProductId());
                    wishList.setUserId(wishListDetails.getUserId());
                    return wishListRepository.save(wishList);
                }).orElse(null);
    }

    @Override
    public void deleteWishList(Long id){
        wishListRepository.deleteById(id);
    }
}
