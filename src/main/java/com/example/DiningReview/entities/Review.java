package com.example.DiningReview.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Review {
    @Id
    @GeneratedValue
    private Long id;

    private String UserName;
    private Long restaurantId;
    private String review;

    private Integer peanutScore;
    private Integer dairyScore;
    private Integer eggScore;

   
}
