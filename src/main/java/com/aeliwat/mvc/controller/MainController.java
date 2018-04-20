package com.aeliwat.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aeliwat.mvc.services.GreetingService;

@Controller
@RequestMapping("/main")
public class MainController {

	
	
	@Autowired
	private GreetingService service;
	
	@RequestMapping("/")
	public String message(Model model){
		model.addAttribute("message",this.service.getGreet());
		return "home";
	}
}
