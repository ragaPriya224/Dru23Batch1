package com.example.jpaConceptDemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.jpaConceptDemo.entity.Topic;

public interface TopicRepository extends CrudRepository<Topic,String>{

}
