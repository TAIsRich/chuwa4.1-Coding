package com.example.useraccountproject.services;

import com.example.useraccountproject.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public User getUser(@PathVariable long id) throws UserNotFoundException {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            return userOptional.get();
        } else {
            throw new UserNotFoundException(id + " not found");
        }
    }

    @PostMapping
    public User createUser(@RequestBody User user) throws RecordExistedException {
        Optional<User> userOptional = userRepository.findById(user.getId());
        if (!userOptional.isPresent()) {
            return userRepository.save(user);
        } else {
            throw new RecordExistedException(user.getId() + " already existed");
        }
    }
}
