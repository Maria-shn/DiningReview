package com.example.DiningReview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
 @EntityScan(basePackages = "com.example.DiningReview.entities")
  
public class DiningReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiningReviewApplication.class, args);
	}

}
