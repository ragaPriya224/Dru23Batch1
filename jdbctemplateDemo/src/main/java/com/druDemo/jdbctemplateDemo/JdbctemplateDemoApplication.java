package com.druDemo.jdbctemplateDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.druDemo.jdbctemplateDemo.dao.CourseJdbcDAO;

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
		System.out.println("hello");
		
		System.out.println(dao.getList());

		System.out.println("bye");

	}

}
