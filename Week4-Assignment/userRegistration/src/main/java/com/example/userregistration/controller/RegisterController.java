package com.example.userregistration.controller;

import com.example.userregistration.entity.User;
import com.example.userregistration.service.RegisterService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RegisterController {

    private RegisterService registerService;

    @Autowired
    public RegisterController(RegisterService registerService){
        this.registerService = registerService;
    }

    @PostMapping("/register/user")
    public void signUp(@RequestBody User user){
        registerService.addUser(user);
    }

    @GetMapping("/user/{userId}")
    public User getUser(@PathVariable Long userId){
        return registerService.getUser(userId);
    }

//    @GetMapping("/user/?account = user_id}")
//    public User getUser(@RequestParam Long userId){
//        return registerService.getUser(userId);
//    }


}
