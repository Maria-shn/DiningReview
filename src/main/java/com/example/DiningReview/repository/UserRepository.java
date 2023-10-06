package com.example.DiningReview.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.DiningReview.entities.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findUserByDisplayName(String displayName);
}