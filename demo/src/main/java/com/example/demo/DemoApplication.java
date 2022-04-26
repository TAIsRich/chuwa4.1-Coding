package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication

@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@GetMapping("/hello/{student}/{id}")
	public Map<String, String> sayHello(@PathVariable String student, @PathVariable String id) {
		HashMap<String,String > map = new HashMap<>();
		map.put(id, student);
		return map;
	}


}