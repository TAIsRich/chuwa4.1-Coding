package com.example.code1.service;

import com.example.code1.entity.User;
import com.example.code1.repository.UserMapper;
import com.example.code1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.criteria.CriteriaBuilder;

@Service
public class MainService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    public @ResponseBody boolean deposit(String username, int amount){
        User user = userMapper.selectByU(username);
        Integer i = Integer.valueOf(amount);
     //   Integer i2 = Integer.valueOf(user.getBalance());
        Integer amountMoney = i;// + i2;     //之前的钱 ?怎么传过来
        String aMoney = amountMoney.toString();
        user.setBalance(aMoney);
        userRepository.save(user);
        return true;
    }

    public @ResponseBody boolean withdraw(String username, int amount){
        User user =userRepository.selectByU1(username);
        Integer i = Integer.valueOf(amount);
        Integer i2 = Integer.valueOf(user.getBalance());
        Integer amountMoney = i - i2;
        String aMoney = amountMoney.toString();
        user.setBalance(aMoney);
       // userRepository.save(user);
        userRepository.UpdateByU(username, aMoney);
        return true;
    }

}
