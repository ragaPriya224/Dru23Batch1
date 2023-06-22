package com.practice.searchDemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.practice.searchDemo.entity.Topic;

public interface TopicRepository extends CrudRepository<Topic,String>{
//	@Query("select p from Product p  where "+
//			"p.name like concat('%', :query, '%')"+
//			"OR p.description like concat('%', :query, '%')")
//	List<Topic> searchProducts(String query);
//	
//	@Query(value = "select * from products p  where "+
//			"p.name like concat('%', :query, '%')"+
//			"OR p.description like concat('%', :query, '%')", nativeQuery=true)
//	List<Topic> searchProductsSql(String query);
}
