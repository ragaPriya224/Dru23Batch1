package com.practice.searchDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	


}
