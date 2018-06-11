package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/redis")
@RestController
public class RedisController {
	
	@Autowired
	private StringRedisTemplate redisTemplate;
	
	@GetMapping(value="add")
	public Object add() {
		redisTemplate.opsForValue().set("fazhicao", "chenwen");
		return "redis add";
	}
	
	@GetMapping(value="get")
	public Object get() {
		String val = redisTemplate.opsForValue().get("fazhicao");
		return val;
	}

}
