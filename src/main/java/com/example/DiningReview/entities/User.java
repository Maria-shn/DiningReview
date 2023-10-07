package com.example.DiningReview.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "\"user\"")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String displayName;

    private String city;
    private String state;
    private String zipCode;

    private Boolean peanutWatch;
    private Boolean dairyWatch;
    private Boolean eggWatch;
}

