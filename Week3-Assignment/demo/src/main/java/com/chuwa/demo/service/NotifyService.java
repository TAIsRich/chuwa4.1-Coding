package com.chuwa.demo.service;

import com.chuwa.demo.entity.User;
import com.chuwa.demo.entity.UserPreference;
import com.chuwa.demo.repository.NotifyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NotifyService {

    public NotifyRepository notifyRepository;

    @Autowired
    public NotifyService(NotifyRepository notifyRepository){
        this.notifyRepository = notifyRepository;
    }
    private List<User> smsList = new ArrayList<>();
    private List<User> emailList = new ArrayList<>();

    public List<User> findByEmail(){
        return notifyRepository.findByUserPreference(UserPreference.EMAIL);
    }
    public List<User> findBySMS(){
        return notifyRepository.findByUserPreference(UserPreference.SMS);
    }

    public User findByUserId(Long userId){
        return notifyRepository.findUserBySerialUID(userId);
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
    public void detach(User user){
        if (user.getUserPreference() == UserPreference.EMAIL){
            emailList.remove(user);
        }else if(user.getUserPreference() == UserPreference.SMS){
            smsList.remove(user);
        }else{
            System.out.println("user not found");
        }
    }

    public void notifyAll(String message){
        for(User user: emailList){
            user.update(message);
        }
        for(User user: smsList){
            user.update(message);
        }
    }
    
}
