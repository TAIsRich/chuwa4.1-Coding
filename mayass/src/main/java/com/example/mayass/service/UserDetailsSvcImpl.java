package com.example.mayass.service;

import com.example.mayass.entity.User;
import com.example.mayass.exceptions.UserNotFoundException;
import com.example.mayass.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsSvcImpl implements UserDetailsService {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UserNotFoundException {

        try {
            return getUserDetailsInternal(username);
        } catch (Exception e){
            logger.error("loadUserByUsername:returned user not found",e);
            throw e;
        }

    }

    private UserDetails getUserDetailsInternal(String username) {
        User user = userRepository.findByLogin(username);
        if(user==null) {
            throw new UsernameNotFoundException("User not found"+ username);
        }
        UserDetails userDetails = org.springframework.security.core.userdetails.User.withUsername(user.getName()).password(user.getPassword()).authorities("USER").build();
        return userDetails;
    }

}
