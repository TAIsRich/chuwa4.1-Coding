package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/hello/{student}/{id}")
public class id {
    @GetMapping
    public Map<String, String> sayHello(@PathVariable String student, @PathVariable String id) {
        HashMap<String,String > map = new HashMap<>();
        map.put(id, student);
        return map;
    }

}
