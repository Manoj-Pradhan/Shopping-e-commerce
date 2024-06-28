package com.example.jazzy_kart.impl;

import com.example.jazzy_kart.model.Review;

import java.util.List;

public interface IReviewService {

    Review saveReview(Review review);

    List<Review> getAllReviews();

    Review getReviewById(Long id);

    Review updateReview(Long id, Review reviewDetails);
}
