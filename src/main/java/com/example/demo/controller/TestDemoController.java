package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/test")
@RestController
public class TestDemoController {
	
	@GetMapping
	public Object test() {
		return "hello world test jenkins... 像我这样的人-毛不易";
	}
	
	
	@GetMapping("hello")
	public Object index() {
		return "糟糕的一天............";
	}
	
	

}
