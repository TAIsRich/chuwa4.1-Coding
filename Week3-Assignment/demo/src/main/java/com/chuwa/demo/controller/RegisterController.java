package com.chuwa.demo.controller;

import com.chuwa.demo.entity.User;
import com.chuwa.demo.entity.UserPreference;
import com.chuwa.demo.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
public class RegisterController {
    private RegisterService registerService;

    @Autowired
    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }

    @PostMapping("/register/email")
    public void addGuest(@RequestBody User user) {
        registerService.attach(user, UserPreference.EMAIL);
    }

    @PostMapping("/register/sms")
    public void addHost(@RequestBody User user) {
        registerService.attach(user, UserPreference.SMS);
    }
}
