package com.example.jazzy_kart.controller;

import com.example.jazzy_kart.model.Review;
import com.example.jazzy_kart.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping("/review")
    public Review saveReview(@RequestBody Review review) {
        return reviewService.saveReview(review);
    }

    @GetMapping("/reviews")
    public List<Review> getAllReviews(){
        return reviewService.getAllReviews();
    }

    @GetMapping("/reviews/{id}")
    public Review getReviewById(@PathVariable Long id){
        return reviewService.getReviewById(id);
    }

    @PutMapping("/reviews/{id}")
    public Review updateReview(@PathVariable Long id, @RequestBody Review reviewDetails){
        return reviewService.updateReview(id, reviewDetails);
    }

    @DeleteMapping("/reviews/{id}")
    public void deleteReview(@PathVariable Long id){
        reviewService.deleteReview(id);
    }
}
