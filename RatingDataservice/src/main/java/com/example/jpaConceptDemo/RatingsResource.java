package com.example.jpaConceptDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RatingsResource {


	@GetMapping("/ratingsdata/{movieId}")
	public Rating getRating(@PathVariable String movieId){
		return new Rating(movieId,3);


		//return? movie details along with ratings
	}
}
