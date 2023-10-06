package com.example.DiningReview.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import com.example.DiningReview.entities.Restaurant;
import com.example.DiningReview.entities.Review;
import com.example.DiningReview.entities.User;
import com.example.DiningReview.repository.RestaurantRepository;
import com.example.DiningReview.repository.ReviewRepository;
import com.example.DiningReview.repository.UserRepository;

import java.util.Optional;

@RequestMapping("/reviews")
@RestController
public class ReviewController {
    private final ReviewRepository reviewRepository;
    private final UserRepository userRepository;
    private final RestaurantRepository restaurantRepository;

    public ReviewController(ReviewRepository reviewRepository, UserRepository userRepository, RestaurantRepository restaurantRepository) {
        this.reviewRepository = reviewRepository;
        this.userRepository = userRepository;
        this.restaurantRepository = restaurantRepository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void addUserReview(@RequestBody Review review) {
        if (review.getUserName() == null || review.getRestaurantId()==null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        if (review.getPeanutScore() == null && review.getDairyScore() == null && review.getEggScore()== null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        Optional<User> optionalUser = userRepository.findUserByDisplayName(review.getUserName());
        if (optionalUser.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY);
        }

        Optional<Restaurant> optionalRestaurant = restaurantRepository.findById(review.getRestaurantId());
        if (optionalRestaurant.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY);
        }
        reviewRepository.save(review);
    }

    
}
