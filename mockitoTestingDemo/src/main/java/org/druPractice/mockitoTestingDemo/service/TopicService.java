package org.druPractice.mockitoTestingDemo.service;

import java.util.ArrayList;
import java.util.List;

import org.druPractice.mockitoTestingDemo.entity.Topic;
import org.druPractice.mockitoTestingDemo.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	TopicRepository topicRepository;

	public List<Topic> getAllTopic() {
		List<Topic> topicsList = new ArrayList<>();
		topicRepository.findAll().forEach(topicsList::add);
		return topicsList;
	}

//	public Topic getTopic(String id) {
//		Topic topic = new Topic();
//		for(int i = 0 ; i<topicList.size();i++) {
//			if(topicList.get(i).getId().equals(id)) {
//				return topicList.get(i);
//			}
//		}
//		return topic;
//	}
//
//	public void addTopic(Topic topic) {
//		topicList.add(topic);
//		
//	}
//
//	public void deleteTopic(String id) {
//		topicList.removeIf(t -> t.getId().equals(id));
//	}
//
//	public void updateTopic(Topic topic, String id) {
//		for(int i = 0 ; i<topicList.size();i++) {
//			if(topicList.get(i).getId().equals(id)) {
//				topicList.set(i, topic);
//				return;
//			}
//		}
		
//	}

}
