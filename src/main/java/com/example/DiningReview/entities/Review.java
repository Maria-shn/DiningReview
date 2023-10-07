package com.example.DiningReview.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Review {
    @Id
    @GeneratedValue
    private Long id;

    private String userName;
    private Long restaurantId;
    private String review;

    private Integer peanutScore;
    private Integer dairyScore;
    private Integer eggScore;

   
}
