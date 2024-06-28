package com.example.jazzy_kart.service;

import com.example.jazzy_kart.impl.IReviewService;
import com.example.jazzy_kart.model.Review;
import com.example.jazzy_kart.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService implements IReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public Review saveReview(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    @Override
    public Review getReviewById(Long id) {
        return reviewRepository.findById(id).orElse(null);
    }

    @Override
    public Review updateReview(Long id, Review reviewDetails) {
        return reviewRepository.findById(id)
                .map(review -> {
                    review.setProductId(reviewDetails.getProductId());
                    review.setProductName(reviewDetails.getProductName());
                    review.setCustomerId(reviewDetails.getCustomerId());
                    review.setComment(reviewDetails.getComment());
                    review.setRating(reviewDetails.getRating());
                    return reviewRepository.save(review);
                }).orElse(null);

    }

    public void deleteReview(Long id){
        reviewRepository.deleteById(id);
    }
}
