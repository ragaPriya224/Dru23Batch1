package com.druDemo.jdbctemplateDemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.druDemo.jdbctemplateDemo.dao.CourseJdbcDAO;
import com.druDemo.jdbctemplateDemo.dao.CourseNamedJdbcDAO;
import com.druDemo.jdbctemplateDemo.model.Course;

@SpringBootApplication
public class JdbctemplateDemoApplication {
	//	  private  CourseJdbcDAO<Course> dao;
	//	@Autowired
	//	private static CourseJdbcDAO dao;
	////	    public JdbctemplateDemoApplication(CourseJdbcDAO dao) {
	////	        this.dao = dao;
	////	    }

	private static CourseJdbcDAO dao;
	private static CourseNamedJdbcDAO namedJdbcDao;
	public JdbctemplateDemoApplication(CourseJdbcDAO dao) {
		this.dao = dao;
	}
//	public JdbctemplateDemoApplication(CourseNamedJdbcDAO namedJdbcDao) {
//		this.namedJdbcDao = namedJdbcDao;
//	}

	public static void main(String[] args) {
		SpringApplication.run(JdbctemplateDemoApplication.class, args);
//		System.out.println("----GET ALL COURSES-------------------");
//
//		System.out.println(dao.getCourseList());
//
//		System.out.println("-------------GET PARTICULAR COURSE----------");
//		System.out.println(dao.getCourse(477777));
//
//		System.out.println("-------------create COURSE----------");
//		Course c = new Course(22,"english","spoken","dumyt lihnk");
//		dao.create(c);
//		System.out.println("-------------update COURSE----------");
//		Course c1 = new Course(22,"japanese","spoken","dumyt lihnk");
//		dao.update(c1, 22);
//		System.out.println("-------------delete COURSE----------");
//		dao.delete(2);
//		System.out.println("------NAMED PARAMETER-----------------");
//		System.out.println(namedJdbcDao.getByTitleTemplate());
//		System.out.println("-----------------------");
//		System.out.println(namedJdbcDao.getByTitle());
		System.out.println("----batch op-------------------");
		List<Course> courseList = new ArrayList<Course>();
		Course c = new Course(100,"cantoneseE","spoken","dumyt lihnk");
		Course c1 = new Course(101,"chin","spoken","dumyt lihnk");
		Course c2 = new Course(102,"hebr","spoken","dumyt lihnk");
		Course c3 = new Course(103,"malay","spoken","dumyt lihnk");
		courseList.add(c);
		courseList.add(c1);
		courseList.add(c2);
		courseList.add(c3);
		System.out.println(dao.batchUpdateUsingJdbcTemplate(courseList));
	}

}
