package org.druPractice.mockitoTestingDemo.repository;

import org.druPractice.mockitoTestingDemo.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TopicRepository extends JpaRepository<Topic,String>{

}
