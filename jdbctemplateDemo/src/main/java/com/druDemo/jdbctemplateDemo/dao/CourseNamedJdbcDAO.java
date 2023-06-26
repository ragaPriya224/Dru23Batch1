package com.druDemo.jdbctemplateDemo.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

import com.druDemo.jdbctemplateDemo.model.Course;

@Component
public class CourseNamedJdbcDAO {

	private static final Logger log = LoggerFactory.getLogger(CourseNamedJdbcDAO.class);
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	public CourseNamedJdbcDAO(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}
	RowMapper<Course> rowMapper = (rs, rowNum) -> {
		Course course = new Course();
		course.setCourseId(rs.getInt("course_id"));
		course.setTitle(rs.getString("title"));
		course.setDescription(rs.getString("description"));
		course.setLink(rs.getString("link"));
		return course;
	};

	//  using the MapSqlParameterSource to provide the values for the named parameters.
	public String  getByTitleTemplate() {
		//		  Course c = null;
		SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("id", 1);
		return namedParameterJdbcTemplate.queryForObject(
				"SELECT title FROM course WHERE course_id = :id", namedParameters, String.class);
	}
	public String  getByTitle() {
		Course  course = new Course();
		course.setCourseId(1);
		SqlParameterSource namedParameters = new BeanPropertySqlParameterSource(course);
		return namedParameterJdbcTemplate.queryForObject(
				"SELECT title FROM course WHERE course_id = :courseId", namedParameters, String.class);

	}


}
