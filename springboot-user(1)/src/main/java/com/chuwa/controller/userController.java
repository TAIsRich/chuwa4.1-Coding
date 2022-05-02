package com.chuwa.controller;

import com.chuwa.PoJo.User;
import com.chuwa.Repo.UserRepo;
import com.chuwa.service.UserService;
import com.chuwa.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class userController {

    @Autowired
    private UserServiceImpl userServiceImpl;


    @PostMapping("/signup")
    public ResponseEntity<User> registerUser(@RequestBody User user){


        User newUser = userServiceImpl.addUser(user);
        return  new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }


    @GetMapping("/find/{email}")
    public ResponseEntity<User> getUserByEmail(@PathVariable("email") String email){
        User user = userServiceImpl.findUserByEmail(email);
        return  new ResponseEntity<>(user,HttpStatus.OK);
    }



}
