package com.example.jpaConceptDemo;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieCatalogResource {

	
	@GetMapping("/catalog/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable String userId){

		return Collections.singletonList(new CatalogItem("spiderman","saving galaxt",4)
				);

		//return? movie details along with ratings
	}
}
