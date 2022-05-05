package com.chuwa.service.impl;

import com.chuwa.Exception.UserNotFoundException;
import com.chuwa.PoJo.User;
import com.chuwa.Repo.UserRepo;
import com.chuwa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.List;
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


        if(ObjectUtils.isEmpty(user) || ObjectUtils.isEmpty(user.getPassword()) || !StringUtils.hasText(user.getPassword())){


            throw new RuntimeException("username or password is null");

        }
        return userRepo.save(user);


    }

    @Override
    public User findUserByEmail(String email){
        return userRepo.findUserByEmail(email)
                .orElseThrow(()->new UserNotFoundException("User by id "+email+"was not found"));
    }



    public List<User> findAllUsers(){
        return userRepo.findAll();
    }

    public User updateUser(User user){
        return userRepo.save(user);
    }



    public void deleteUser(Long id){
        userRepo.deleteUserById(id);
    }

}

