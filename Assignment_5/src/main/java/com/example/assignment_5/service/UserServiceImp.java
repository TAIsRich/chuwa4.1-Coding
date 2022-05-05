package com.example.assignment_5.service;

import com.example.assignment_5.entity.User;
import com.example.assignment_5.exception.UserExistsException;
import com.example.assignment_5.exception.UserNotFoundException;
import com.example.assignment_5.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImp implements UserService{
    UserRepository userRepository;


    @Autowired
    public void UserServiceImp(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;


    }


    @Override
    public void removeUser(User user) {
        List<User> results = userRepository.findByUserName(user.getUserName());
        if (results.size() == 0) {
            throw new UserNotFoundException(user.getUserName());
        }
        userRepository.delete(user);
    }

    @Override
    public void addUser(User user) {
        List<User> results = userRepository.findByUserName(user.getUserName());
        if (results.size() != 0) {
            throw new UserExistsException(user.getUserName());
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
