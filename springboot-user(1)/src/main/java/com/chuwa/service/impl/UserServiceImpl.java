package com.chuwa.service.impl;

import com.chuwa.Exception.UserNotFoundException;
import com.chuwa.PoJo.User;
import com.chuwa.Repo.UserRepo;
import com.chuwa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

    private UserRepo userRepo;

    @Autowired
    public UserServiceImpl(UserRepo userRepo) {
        super();
        this.userRepo = userRepo;
    }

    @Override
    public User addUser(User user) {
        return userRepo.save(user);
      // userRepo.save(user);
      // return user;
    }

    @Override
    public User findUserByEmail(String email){
        return userRepo.findUserByEmail(email)
                .orElseThrow(()->new UserNotFoundException("User by id "+email+"was not found"));
    }
}

