package com.example.DiningReview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "/Users/maria/Library/Mobile Documents/com~apple~CloudDocs/projects/DiningReview/DiningReview/src/main/java/com/example/DiningReview/entities")
public class DiningReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiningReviewApplication.class, args);
	}

}
