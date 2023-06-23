package com.druDemo.jdbctemplateDemo.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.druDemo.jdbctemplateDemo.model.Course;

@Component
public class CourseJdbcDAO {
	
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
    public List<Course> getList() {
        String sql = "SELECT course_id, title, description, link from course";
        return jdbcTemplate.query(sql,rowMapper);
    }
	
	
}
