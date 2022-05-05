package com.example.usersystem.controller;

import com.example.usersystem.model.User;
import com.example.usersystem.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RegisterController {

    private RegisterService registerService;

    @Autowired
    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }

    @PostMapping("/register/user")
    public void register(@RequestBody User user) {
        registerService.addUser(user);
    }

    @GetMapping("/register/user/{userName}")
    public User getUser(@PathVariable String userName) {
        return registerService.getUser(userName);
    }
}
