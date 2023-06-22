package com.practice.searchDemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.practice.searchDemo.entity.Topic;

public interface TopicRepository extends JpaRepository<Topic,String>{
	@Query("select p from Topic p  where "+
			"p.name like concat('%', :query, '%')"+
			" OR p.description like concat('%', :query, '%')")
	List<Topic> searchTopic(String query);
//	
//	@Query(value = "select * from products p  where "+
//			"p.name like concat('%', :query, '%')"+
//			"OR p.description like concat('%', :query, '%')", nativeQuery=true)
//	List<Topic> searchProductsSql(String query);
}
