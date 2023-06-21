package com.practice.configDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
@Configuration
@ConfigurationProperties("my")
public class UserConfig {
	
	private Integer greeting;
	
//	@Value("#{list.names}")
//	private List<String>  nameList;

	public Integer getGreeting() {
		return greeting;
	}

	public void setGreeting(Integer greeting) {
		this.greeting = greeting;
	}

//	public List<String> getNameList() {
//		return nameList;
//	}
//
//	public void setNameList(List<String> nameList) {
//		this.nameList = nameList;
//	}

	
	
}
