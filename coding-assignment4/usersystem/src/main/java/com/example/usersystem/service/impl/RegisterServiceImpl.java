package com.example.usersystem.service.impl;

import com.example.usersystem.exception.UserAlreadyExistException;
import com.example.usersystem.exception.UserNotFoundException;
import com.example.usersystem.model.User;
import com.example.usersystem.repository.UserRepository;
import com.example.usersystem.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterServiceImpl implements RegisterService {

    UserRepository userRepository;

    @Autowired
    public RegisterServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public void addUser(User user) {
        List<User> results = userRepository.findByUserName(user.getUserName());
        if (results.size() != 0) {
            throw new UserAlreadyExistException(user.getUserName());
        }
        userRepository.save(user);
    }

    @Override
    public User getUser(String userName) {
        List<User> results = userRepository.findByUserName(userName);
        if (results.size() == 0) {
            throw new UserNotFoundException(userName);
        }
        return userRepository.findByUserName(userName).get(0);
    }
}
