package com.practice.searchDemo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.practice.searchDemo.entity.Topic;
import com.practice.searchDemo.repository.TopicRepository;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	public  List<Topic>  getAllTopics(){
		List<Topic> topicsList = new ArrayList<>();
		topicRepository.findAll().forEach(topicsList::add);
		return topicsList;
	}

	public  void  addTopic(Topic topic){
		topicRepository.save(topic);
	}
	
//	public Page<Topic> findByPage(Optional<Integer> pageParam, Optional<String> sortBy) {
//		// TODO Auto-generated method stub
//		return	topicRepository.findAll(PageRequest.of(pageParam.orElse(0), 3,
//				Direction.ASC,sortBy.orElse("id")));
//	}
}

