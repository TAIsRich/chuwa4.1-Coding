package com.example.springboottutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class SpringBootTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTutorialApplication.class, args);
    }
    @GetMapping("/hello/{id}/{name}")
    public String sayHello(@PathVariable String id, @PathVariable String name) {
        return "ID: " + id + ", name: " + name;
    }

}
