package com.example.DiningReview.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Restaurant {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;
    private String city;
    private String zipCode;
    private String overallScore;
    private String peanutScore;
    private String dairyScore;
    private String eggScore;
}

