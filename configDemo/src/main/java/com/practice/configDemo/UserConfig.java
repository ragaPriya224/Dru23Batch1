package com.practice.configDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
@Configuration
@ConfigurationProperties("my")
public class UserConfig {
	
	private String greeting;
	
//	@Value("#{list.names}")
//	private List<String>  nameList;

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
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
