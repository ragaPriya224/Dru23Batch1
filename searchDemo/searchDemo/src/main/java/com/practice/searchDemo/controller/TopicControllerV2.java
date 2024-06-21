package com.practice.searchDemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
@RequestMapping("/api/v2/topics")
public class TopicControllerV2 {
	@Autowired
	TopicService topicService;

	@RequestMapping
	public List<Topic> getAllTheTopics() {
		return topicService.getAllTopics();
	}
	
	//localhost:8080/topics/page?pageNo=1&sort=name
	@GetMapping("/page")
	public  Page<Topic>  getTopicsByPage(
			@RequestParam("pageNo") Optional<Integer> pageParam,
			@RequestParam("sort") Optional<String>  sortBy){
		return topicService.getProductsByPage(pageParam,sortBy);
	}

}
