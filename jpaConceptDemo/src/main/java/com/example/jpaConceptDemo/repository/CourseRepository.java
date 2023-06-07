package com.example.jpaConceptDemo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.jpaConceptDemo.entity.Course;

public interface CourseRepository extends CrudRepository<Course,String>{

	List<Course>	findByTopicId(String topicId);
//	List<Course> findByName(String name);
	//findByProperty
}
