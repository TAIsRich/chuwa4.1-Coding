package com.example.userregistration.service;

import com.example.userregistration.entity.User;
import com.example.userregistration.exceptions.UserAlreadyExistException;
import com.example.userregistration.exceptions.UserNotFoundException;
import com.example.userregistration.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {
    // service is the business logic tier, also connect with data tier
    private UserRepository userRepository;

    @Autowired
    public RegisterService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public void addUser(User user) throws UserAlreadyExistException {
        if(userRepository.existsByUsername(user.getUsername())){
            throw new UserAlreadyExistException("username already exist");
        }
        userRepository.save(user);
    }

    public User getUser(Long userId) throws UserNotFoundException{
        if(userRepository.existsById(userId)){
            throw new UserNotFoundException("user is not found");
        }
        return userRepository.findUserByUserId(userId);
    }

}
