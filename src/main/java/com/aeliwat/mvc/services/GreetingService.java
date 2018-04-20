package com.aeliwat.mvc.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

	
	public String getGreet(){
		return "hello world";
	}
}
