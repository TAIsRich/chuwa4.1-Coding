package com.example.user.h2.controller;

import com.example.user.h2.entity.User;
import com.example.user.h2.repository.UserRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private final UserRepo repo;

    public UserController(UserRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/user")
    List<User> all() {
        return repo.findAll();
    }

    @PostMapping("/user")
    User newUser(@RequestParam User newUser) {
        return repo.save(newUser);
    }

    @GetMapping("/user/{id}")
    User one(@PathVariable Long id) {
        return repo.findById(id)
                .orElseThrow(()->new UserNotFoundException(id));
    }

    @PutMapping("/user/{id}")
    User replaceUser(@RequestBody User newUser, @PathVariable Long id) {
        return repo.findById(id)
                .map(user->{
                    user.setName(newUser.getName());
                    user.setPassword(newUser.getPassword());
                    user.setEmail(newUser.getEmail());
                    return repo.save(user);
                })
                .orElseGet(()->{
                    newUser.setId(id);
                    return repo.save(newUser);
                });
    }

    @DeleteMapping("/user/{id}")
    void deleteUser(@PathVariable Long id) {
        repo.deleteById(id);
    }

}

