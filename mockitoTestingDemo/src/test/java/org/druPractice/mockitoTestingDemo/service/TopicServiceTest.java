package org.druPractice.mockitoTestingDemo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.druPractice.mockitoTestingDemo.entity.Topic;
import org.druPractice.mockitoTestingDemo.repository.TopicRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

//@RunWith(MockitoJUnitRunner.class)
@ExtendWith(MockitoExtension.class)
public class TopicServiceTest {
	@Mock
	TopicRepository topicRepository;

	@InjectMocks
	TopicService topicService;
	
	@Test
	public void getAllTopicsTest() {
		System.out.println("TESTINGGGG");
		List<Topic> topicList = new ArrayList<Topic>();
		topicList.add(new Topic("1","abc","des",25));
		when(topicRepository.findAll()).thenReturn(topicList);
		List<Topic> outputList = topicService.getAllTopic();
		assertEquals(1, outputList.size());
	   assertEquals(25,outputList.get(0).getAge());
	}
}
