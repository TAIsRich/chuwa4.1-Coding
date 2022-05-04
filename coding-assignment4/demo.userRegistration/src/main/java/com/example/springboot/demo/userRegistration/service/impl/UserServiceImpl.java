package com.example.springboot.demo.userRegistration.service.impl;

import com.example.springboot.demo.userRegistration.entity.User;
import com.example.springboot.demo.userRegistration.exception.UserExistException;
import com.example.springboot.demo.userRegistration.exception.UserNotFoundException;
import com.example.springboot.demo.userRegistration.repository.UserRepository;
import com.example.springboot.demo.userRegistration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> searchUsers(String query)  {

        List<User> users= userRepository.searchUsers(query);



        return users;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(User user) throws UserExistException {
        if (userRepository.existsById(user.getUserId())){
            throw new UserExistException("user exists!");
        }
        return userRepository.save(user);
    }
}
