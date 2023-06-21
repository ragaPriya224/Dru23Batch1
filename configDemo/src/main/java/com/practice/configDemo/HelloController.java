package com.practice.configDemo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@Value("${my.greeting}")
	public String greetingMsg;
	
	@Value("${my.name: notfound}")
	public String userName;
	
	@Value("${my.list.names: notfound}")
	public List<String> nameList;
	
	@Value("#{${dbDetails}}")
	public Map<String,String> dbMap;
	
	@GetMapping("/hello")
	public String sayHi() {
		return greetingMsg;
	}
	
	@GetMapping("/helloU")
	public String sayName() {
		return userName;
	}
	@GetMapping("/helloUsers")
	public List<String> getNames() {
		return nameList;
	}
	@GetMapping("/helloDbUser")
	public Map<String,String> showDetail() {
		return dbMap;
	}

}
