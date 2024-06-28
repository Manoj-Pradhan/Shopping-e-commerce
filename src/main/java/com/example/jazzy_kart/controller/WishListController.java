package com.example.jazzy_kart.controller;

import com.example.jazzy_kart.model.WishList;
import com.example.jazzy_kart.service.WishListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class WishListController {

    @Autowired
    private WishListService wishListService;

    @PostMapping("/wishList")
    public WishList saveWishList(@RequestBody WishList wishList) {
        return wishListService.saveWishList(wishList);
    }

    @GetMapping("/wishLists")
    public List<WishList> getAllWishLists() {
        return wishListService.getWishLists();
    }

    @GetMapping("/wishLists/{id}")
    public WishList getWishListById(@PathVariable Long id) {
        return wishListService.getWishListById(id);
    }

    @PutMapping("/wishLists/{id}")
    public WishList updateWishList(@PathVariable Long id, @RequestBody WishList wishListDetails) {
        return wishListService.updateWishList(id, wishListDetails);
    }

    @DeleteMapping("/wishLists/{id}")
    public void deleteWishList(@PathVariable Long id) {
        wishListService.deleteWishList(id);
    }


}
