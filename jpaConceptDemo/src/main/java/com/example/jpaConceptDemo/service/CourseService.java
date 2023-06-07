package com.example.jpaConceptDemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpaConceptDemo.entity.Course;
import com.example.jpaConceptDemo.entity.Topic;
import com.example.jpaConceptDemo.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public  List<Course>  getAllCourses(String id){
		List<Course> courseList = new ArrayList<>();
		courseRepository.findByTopicId(id).forEach(courseList::add);
		//		courseRepository.findAll().forEach(courseList::add);
		return courseList;

	}
	public  Course  getCourse(String id){
		return courseRepository.findById(id).get();
	}

	public  void  addCourse(Course course){
		courseRepository.save(course);
	}
	public  void  updateCourse(Course course){
		courseRepository.save(course);

	}
	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
}

