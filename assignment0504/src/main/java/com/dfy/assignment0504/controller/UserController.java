package com.dfy.assignment0504.controller;

import com.dfy.assignment0504.entity.User;
import com.dfy.assignment0504.exception.UserNotFoundException;
import com.dfy.assignment0504.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 5/4/22 12:41 PM
 */

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("{id}")
    public User searchUserById(@PathVariable Long id) {
        return userService.searchUserById(id);
    }

    @DeleteMapping("{id}")
    public void deleteUserById(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @PutMapping("{id}")
    public User updateUser(@RequestBody User user, @PathVariable Long id) {
        return userService.updateUser(user, id);
    }

    @GetMapping("/login/{id}/{firstName}")
    public User validate(@PathVariable("id") Long id, @PathVariable ("firstName") String firstName) {
        if (userService.login(id, firstName)) {
            return userService.searchUserById(id);
        } else throw new UserNotFoundException("your id or first_name is incorrect!");
    }



}
