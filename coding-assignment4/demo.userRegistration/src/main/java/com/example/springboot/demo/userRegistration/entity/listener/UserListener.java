package com.example.springboot.demo.userRegistration.entity.listener;

import com.example.springboot.demo.userRegistration.entity.User;

import javax.persistence.PostPersist;

public class UserListener {
    @PostPersist
    public void logAddition(Object user){
        System.out.println("UserListener::Added new user:"+((User) user).getUserName());
    }
}
