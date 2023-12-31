package com.example.DiningReview.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.DiningReview.entities.Review;

import java.util.List;
//import org.springframework.data.repository.CrudRepository;


public interface ReviewRepository extends CrudRepository<Review, Long> {
    List<Review> findReviewsByRestaurantIdAndUserName(Long restaurantId, String userName);
    List<Review> findReviewsByRestaurantId(Long restaurantId);
}

