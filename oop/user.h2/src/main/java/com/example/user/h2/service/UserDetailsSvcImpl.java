/*package com.example.user.h2.service;

import com.example.user.h2.entity.User;
import com.example.user.h2.exceptions.UserNotFoundException;
import com.example.user.h2.repository.UserRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import javax.transaction.Transactional;

@Service
public class UserDetailsSvcImpl implements UserDetailsService{

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserRepo userRepo;

    @Autowired
    UserDetailsSvcImpl(UserRepo userRepo) {
        super();
        this.userRepo = userRepo;
    }

    public UserDetails loadUserByUsername(String username) throws UserNotFoundException {
        try {
            return getUserDetailsInternal(username);
        } catch (Exception e) {
            logger.error("loadUserByUsername:returned user not found", e);
            throw e;
        }
    }

    private UserDetails getUserDetailsInternal(String username) {
        User user = userRepo.findByLogin(username);
        if (user == null) {
            throw new UserNotFoundException("User not found", "Id");
        }

        return null;
        //UserDetails userDetails =
        //return new org.springframework.security.core.userdetails.User(user.getLoginName()).password(user.getPassword()).authorities("USER").build();
        //return userDetails;
    }


}*/
