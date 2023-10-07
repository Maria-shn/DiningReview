package com.example.DiningReview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
 //@ComponentScan(basePackages = { "com.example.*" })
 @EntityScan(basePackages = "com.example*")
  
public class DiningReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiningReviewApplication.class, args);
	}

}
