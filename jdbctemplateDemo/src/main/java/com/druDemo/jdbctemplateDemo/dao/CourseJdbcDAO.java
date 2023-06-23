package com.druDemo.jdbctemplateDemo.dao;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.druDemo.jdbctemplateDemo.model.Course;

@Component
public class CourseJdbcDAO {

	private static final Logger log = LoggerFactory.getLogger(CourseJdbcDAO.class);
	JdbcTemplate jdbcTemplate;
	public CourseJdbcDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	RowMapper<Course> rowMapper = (rs, rowNum) -> {
		Course course = new Course();
		course.setCourseId(rs.getInt("course_id"));
		course.setTitle(rs.getString("title"));
		course.setDescription(rs.getString("description"));
		course.setLink(rs.getString("link"));
		return course;
	};
	public List<Course> getCourseList() {
		String sql = "SELECT course_id, title, description, link from course";
		return jdbcTemplate.query(sql,rowMapper);
	}
	public Optional<Course> getCourse(int id) {
		Course course = null;
		String sql = "SELECT course_id,"
				+ " title, description, link from course "
				+ "where course_id = ?";
		try {
			course =  jdbcTemplate.queryForObject(sql,rowMapper,new Object[]{id});
		}catch(DataAccessException e) {
			log.info("course is not foundfor the id" +id);	
		}

		return Optional.ofNullable(course);
	}
	
	public void create(Course course) {
		String sql = "INSERT INTO course values (?,?,?,?)";
		int output = jdbcTemplate.update(sql,course.getCourseId(),course.getTitle(),
				course.getDescription(),course.getLink());
		if(output == 1) {
			log.info("new course is created with title: "+course.getTitle());	

		}
	}
	public void update(Course course, int id) {
		String sql = "update course set title = ? ,"
				+ "description = ?,link = ? where course_id = ?";
		int output = jdbcTemplate.update(sql,course.getTitle(),
				course.getDescription(),course.getLink(),id);
		if(output == 1) {
			log.info("updated course is created with title: "+course.getTitle());	
		}
	}
	public void delete(int id) {
		String sql = "delete from course where course_id = ?";
		int output = jdbcTemplate.update(sql,id);
		if(output == 1) {
			log.info("delete course is created with id: "+id);	
		}
	}


}
