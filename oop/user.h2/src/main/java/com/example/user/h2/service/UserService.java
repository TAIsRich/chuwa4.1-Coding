package com.example.user.h2.service;


import com.example.user.h2.entity.User;
import com.example.user.h2.exceptions.UserAlreadyExistException;
import com.example.user.h2.exceptions.UserNotFoundException;
import com.example.user.h2.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class UserService{
    private UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public void register(User user) throws UserAlreadyExistException {
        if (userRepo.existByEmail(user.getEmail())) {
            throw new UserAlreadyExistException("User's email already exist!");
        }
        userRepo.save(user);
    }

    public List<User> findAll() {
        return userRepo.findAll();
    }

    public User getUser(Long id) throws UserNotFoundException {
        if(userRepo.existsById(id)) {
            throw new UserNotFoundException("User not found");
        }
        return userRepo.findUserByUserId(id);

    }

    public void deleteById(Long id) throws UserNotFoundException {
        if(!userRepo.existsById(id)) {
            userRepo.deleteById(id);
        }
    }

}
