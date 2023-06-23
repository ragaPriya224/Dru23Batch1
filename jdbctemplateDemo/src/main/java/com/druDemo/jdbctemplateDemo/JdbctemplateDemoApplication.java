package com.druDemo.jdbctemplateDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.druDemo.jdbctemplateDemo.dao.CourseJdbcDAO;
import com.druDemo.jdbctemplateDemo.model.Course;

@SpringBootApplication
public class JdbctemplateDemoApplication {
	////	  private  CourseJdbcDAO<Course> dao;
	//	@Autowired
	//	private static CourseJdbcDAO dao;
	////	    public JdbctemplateDemoApplication(CourseJdbcDAO dao) {
	////	        this.dao = dao;
	////	    }

	private static CourseJdbcDAO dao;

	public JdbctemplateDemoApplication(CourseJdbcDAO dao) {
		this.dao = dao;
	}

	public static void main(String[] args) {
		SpringApplication.run(JdbctemplateDemoApplication.class, args);
		System.out.println("----GET ALL COURSES-------------------");

		System.out.println(dao.getCourseList());

		System.out.println("-------------GET PARTICULAR COURSE----------");
		System.out.println(dao.getCourse(477777));

		System.out.println("-------------create COURSE----------");
		Course c = new Course(22,"english","spoken","dumyt lihnk");
		dao.create(c);
		System.out.println("-------------update COURSE----------");
		Course c1 = new Course(22,"japanese","spoken","dumyt lihnk");
		dao.update(c1, 22);
		System.out.println("-------------delete COURSE----------");
		dao.delete(2);
	}

}
