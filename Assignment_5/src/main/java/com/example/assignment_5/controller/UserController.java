package com.example.assignment_5.controller;

import com.example.assignment_5.entity.User;
import com.example.assignment_5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/register/user")
    public void register(@RequestBody User user) {
        userService.addUser(user);
    }

    @GetMapping("/register/user/{userName}")
    public User getUser(@PathVariable String userName) {
        return userService.getUser(userName);
    }

    @GetMapping("/register/user/{id}")
    public User getId(@PathVariable String id) {
        return userService.getUser(id);
    }

    @GetMapping("/register/user/{email}")
    public User getEmail(@PathVariable String email) {
        return userService.getUser(email);
    }
}



