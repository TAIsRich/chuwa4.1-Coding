package com.example.youtube.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class youtubeController {

    @GetMapping(path="/employees", produces="application/json")
    public String getEmployee() {

        return null;
    }

    @PostMapping(path="/employee", produces = "application/json", consumes = "application/json")
    ResponseEntity<Employee>(employee, HttpStatus.CREATED) {
        return null;
    }

}
