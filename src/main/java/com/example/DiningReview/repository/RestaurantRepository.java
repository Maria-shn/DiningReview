package com.example.DiningReview.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.DiningReview.entities.Restaurant;

import java.util.List;
import java.util.Optional;

@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {
    Optional<Restaurant> findRestaurantsByNameAndZipCode(String name, String zipCode);
    List<Restaurant> findRestaurantsByZipCodeAndPeanutScoreNotNullOrderByPeanutScore(String zipcode);
    List<Restaurant> findRestaurantsByZipCodeAndDairyScoreNotNullOrderByDairyScore(String zipcode);
    List<Restaurant> findRestaurantsByZipCodeAndEggScoreNotNullOrderByEggScore(String zipcode);
}
