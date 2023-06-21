package com.example.jpaConceptDemo;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieCatalogResource {
	@Autowired
	private RestTemplate rt;

	@GetMapping("/catalog/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable String userId){

		//		return Collections.singletonList(new CatalogItem("spiderman","saving galaxt",4)
		//				);
		//		List<Rating> ratingsList = Arrays.asList(new Rating("222",4),
		//				new Rating("41",5));
		UserRating userRating = rt.getForObject("http://localhost:8083/ratingsdata/users/"+userId,UserRating.class);

		return userRating.getUserRating().stream().map(rating ->{
			Movie	m =rt.getForObject("http://localhost:8082/movie/"+rating.getMoveiId(), Movie.class);

			return new CatalogItem(m.getName(),"" ,rating.getRating());
		}).collect(Collectors.toList());


		//return? movie details along with ratings
	}

	
}
//
//List<Integer> movieIdList = new ArrayList<>();
//movieIdList.add(44);
//movieIdList.add(99);
//rt.getForObject("http://localhost:8080/movie/99", Movie.class);
//rt.getForObject("http://localhost:8080/movie/44", Movie.class);
//
//

//1 -> get all rated movie id's
//2 -> for each movie id, call movieinfoservice and get details
//3 -> put them all together
