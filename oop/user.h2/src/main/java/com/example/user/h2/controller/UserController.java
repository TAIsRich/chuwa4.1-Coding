package com.example.user.h2.controller;

import com.example.user.h2.entity.User;
import com.example.user.h2.exceptions.UserNotFoundException;
import com.example.user.h2.repository.UserRepo;
import com.example.user.h2.service.UserService;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        super();
        this.userService = userService;
    }


    @GetMapping("/register")
    public String viewHome() {
        return "registration";
    }

    @GetMapping("/users")
    List<User> getAllUser() {
        return userService.getAll();
    }

    @GetMapping("/username")
    public String currentUserName(User user) {
        return user.getName();
    }

    @GetMapping("/login")
    public String userLogin() {
        return "redirect:/login";
    }


    @PostMapping("/users/user")
    public ResponseEntity<User> saveUser(@RequestBody User newUser) {
        return new ResponseEntity<User>(userService.saveUser(newUser), HttpStatus.CREATED);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long id) {
        return new ResponseEntity<User>(userService.getUserById(id), HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<User> updateEmployee(@PathVariable("id") long id
                                               ,@RequestBody User user){
        return new ResponseEntity<User>(userService.updateUser(user, id), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") long id) {
        userService.deleteUser(id);
        return new ResponseEntity<>("User deleted successfully", HttpStatus.OK);
    }

}

