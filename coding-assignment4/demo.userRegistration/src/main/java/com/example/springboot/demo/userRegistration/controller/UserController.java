package com.example.springboot.demo.userRegistration.controller;


import com.example.springboot.demo.userRegistration.entity.User;
import com.example.springboot.demo.userRegistration.exception.UserExistException;
import com.example.springboot.demo.userRegistration.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    @GetMapping("/search")
    public ResponseEntity<List<User>> searchUsers(@RequestParam("query") String query){
        return ResponseEntity.ok(userService.searchUsers(query));
    }
    @PostMapping
    public User createUser(@RequestBody User user) {
        try {
            return userService.createUser(user);
        } catch (UserExistException e) {
            throw new RuntimeException(e);
        }
    }

}
