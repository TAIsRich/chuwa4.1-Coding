package com.example.assignment_5.service;

import com.example.assignment_5.entity.User;

public interface UserService {
    public void removeUser(User user);
    public void addUser(User user);
    public User getUser(String userName);

}
}
