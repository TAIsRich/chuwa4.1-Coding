package com.chuwa.service;

import com.chuwa.Exception.UserNotFoundException;
import com.chuwa.PoJo.User;
import com.chuwa.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface UserService {
    User addUser(User user);
    User findUserByEmail(String email);



}
