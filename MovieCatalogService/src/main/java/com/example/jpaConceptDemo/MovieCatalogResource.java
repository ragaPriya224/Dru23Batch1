package com.example.jpaConceptDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieCatalogResource {


	@GetMapping("/catalog/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable String userId){

		//		return Collections.singletonList(new CatalogItem("spiderman","saving galaxt",4)
		//				);
		List<Rating> ratingsList = Arrays.asList(new Rating("222",4),
				new Rating("41",5));

		RestTemplate rt = new RestTemplate();
		Movie	a =rt.getForObject("http://localhost:8082/movie/4123", Movie.class);
		return ratingsList.stream().map(rating ->{
			return new CatalogItem("BAAHUBALI","vengence",rating.getRating());
		}).collect(Collectors.toList());


		//return? movie details along with ratings
	}
}

//1 -> get all rated movie id's
//2 -> for each movie id, call movieinfoservice and get details
//3 -> put them all together
