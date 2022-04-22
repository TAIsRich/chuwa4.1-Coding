package com.example.springboottutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class SpringBootTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTutorialApplication.class, args);
    }
    @GetMapping("/hello/{id}/{name}")
    public Map<String, String> sayHello(@PathVariable String id, @PathVariable String name) {
        HashMap<String,String > map = new HashMap<>();
        map.put(id, name);
        return map;
    }

}
