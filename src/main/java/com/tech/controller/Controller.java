package com.tech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
	@GetMapping("/home")
	public String home() {
		return "This is home Page";
	}
	
	
	@GetMapping("/about")
	public String about() {
		return "<h2><center>This is about Page</center></h2>";
	}

}
