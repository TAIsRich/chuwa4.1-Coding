package com.example.helloworld;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


//ref: https://spring.io/guides/gs/rest-service/
@RestController
//marks the class as a controller where every method returns a domain object instead of a view
//shorthand for including both @Controller and @RequestBody
public class HelloController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/hello")
    //GetMapping: ensures that HTTP GET requests to /hello are mapped to the hello() method
    //RequestParam: binds the value of the query string parameter name into the name parameter of the hello() method.
    //if the name parameter is absent in the request, the defaultValue World is used.
    public HelloworldApplication hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new HelloworldApplication(counter.incrementAndGet(), String.format(template, name));
    }
}
