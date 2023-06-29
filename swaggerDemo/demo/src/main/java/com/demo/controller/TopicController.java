package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Topic;
import com.demo.service.TopicService;

@RestController
@RequestMapping("api/v2/")
public class TopicController {
	
	@Autowired
	TopicService topicService;
	
	@GetMapping("/topic")
	public List<Topic> getAllTopic() {
		return topicService.getAllTopic();
	}
	
	@GetMapping("/topic/{id}")
	public  Topic   getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	@PostMapping("/topic")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@DeleteMapping("topic/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}

	@PutMapping("topic/{id}")
	public void updateTopic(@RequestBody Topic topic,
			@PathVariable String id) {
		topicService.updateTopic(topic,id);
	}
}


