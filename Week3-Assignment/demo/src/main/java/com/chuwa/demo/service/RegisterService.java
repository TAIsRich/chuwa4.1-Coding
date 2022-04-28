package com.chuwa.demo.service;

import com.chuwa.demo.entity.User;
import com.chuwa.demo.entity.UserPreference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RegisterService {

    private List<User> smsList = new ArrayList<>();
    private List<User> emailList = new ArrayList<>();

    public void signUp(User user){
        System.out.println("you have successfully signed up");
    }

    public void attach(User user, UserPreference userPreference){
        if (user.getUserPreference() == UserPreference.EMAIL){
            emailList.add(user);
        }else if(user.getUserPreference() == UserPreference.SMS){
            smsList.add(user);
        }else{
            System.out.println("wrong input of user preference");
        }
    }
}
