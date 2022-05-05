package com.example.user.h2.controller;

import com.example.user.h2.entity.User;
import com.example.user.h2.exceptions.UserNotFoundException;
import com.example.user.h2.repository.UserRepo;
import com.example.user.h2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String viewHome() {
        return "registration";
    }

    @GetMapping("/users")
    List<User> getAllUser() {
        return userService.findAll();
    }



    @PostMapping("/users/user")
    void newUser(@RequestBody User newUser) {
        userService.register(newUser);
    }

    @GetMapping("/users/{id}")
    User one(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @DeleteMapping("/users/{id}")
    void deleteUser(@PathVariable Long id) {
        userService.deleteById(id);
    }

}

