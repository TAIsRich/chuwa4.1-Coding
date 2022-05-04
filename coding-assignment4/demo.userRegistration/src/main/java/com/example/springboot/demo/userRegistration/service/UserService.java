package com.example.springboot.demo.userRegistration.service;

import com.example.springboot.demo.userRegistration.entity.User;
import com.example.springboot.demo.userRegistration.exception.UserExistException;

import java.util.List;

public interface UserService {

    List<User> searchUsers(String query);

    List<User> getAllUsers();
    User createUser(User user) throws UserExistException;
}
