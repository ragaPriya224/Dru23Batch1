package com.practice.configDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@Autowired
	UserConfig userConfig;
//	@Value("${my.greeting}")
//	public String greetingMsg;
//	
//	@Value("${my.name: notfound}")
//	public String userName;
	
	
	
	@GetMapping("/welcome")
	public Integer sayHi() {
		return userConfig.getGreeting();
	}
	
//	@GetMapping("/welcomeU")
//	public List<String> sayName() {
//		System.out.println(userConfig.getNameList());
//		return userConfig.getNameList();	}


}
