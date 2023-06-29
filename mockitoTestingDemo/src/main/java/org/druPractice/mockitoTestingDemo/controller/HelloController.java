package org.druPractice.mockitoTestingDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/sayHello")
	public String sayHello() {
		return "hey.........";
	}
}
