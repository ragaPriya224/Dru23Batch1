package com.example.jpaConceptDemo;

import java.util.Arrays;
import java.util.List;

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

	@GetMapping("ratingsdata/users/{userId}")
	public List<Rating> getUserRating(@PathVariable String userId){
		List<Rating> ratingsList = Arrays.asList(new Rating("1234",4),
				new Rating("5678",5));

		return ratingsList;
		//return? movie details along with ratings
	}
}
