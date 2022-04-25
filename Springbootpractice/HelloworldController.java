package com.example.demo;

public class HelloWorldController {
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class HelloWorldController {

        @GetMapping("/hello-world")
        public String helloworld() {
            return "Hello World!";
        }
    }
}
