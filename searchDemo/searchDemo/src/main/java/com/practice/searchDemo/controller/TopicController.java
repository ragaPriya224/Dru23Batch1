package com.practice.searchDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.searchDemo.entity.Topic;
import com.practice.searchDemo.service.TopicService;

@RestController
public class TopicController {
	@Autowired
	TopicService topicService;

	@RequestMapping("/topics")
	public List<Topic> getAllTheTopics() {
		return topicService.getAllTopics();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody Topic topic) {//pick instance from req body 
		topicService.addTopic(topic);   // calling service method for business logic 
	}
	//localhost:8080/search?query=food
	@GetMapping("/search")
	public ResponseEntity<List<Topic>> searchProducts(
			@RequestParam("query") String query){
		System.out.println("---------------");
		return ResponseEntity.ok(topicService.searchProducts(query));
	}


}
