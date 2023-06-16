package com.example.jpaConceptDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieInfoResource {

	
	@GetMapping("/movie/{movieId}")
	public Movie getMovieInfo(@PathVariable String movieId){
return new Movie(movieId,"avenger");
		

		//return? movie details along with ratings
	}
}
