package com.example.jazzy_kart.impl;

import com.example.jazzy_kart.model.WishList;

import java.util.List;

public interface IWishListService {
    WishList saveWishList(WishList wishList);

    List<WishList> getWishLists();

    WishList getWishListById(Long id);

    WishList updateWishList(Long id, WishList wishListDetails);

    void deleteWishList(Long id);
}
