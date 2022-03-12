package com.first.demo.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String greetings() {
		return "hello user";

	}
	
	@GetMapping("/hello/{name}")
	public String greetings(@PathVariable String name) {
		return "hello "+name;

	}


}
