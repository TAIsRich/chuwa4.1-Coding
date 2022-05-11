package com.dfy.assignment0504.service;

import com.dfy.assignment0504.entity.User;

import java.util.List;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 5/11/22 3:03 PM
 */
public interface UserService {

    List<User> getAllUsers();
    User saveUser(User user);
    User searchUserById(Long id);
    User updateUser(User user, Long id);
    void deleteUser(Long id);
    boolean isRegistered(String email);

    boolean login(Long id, String firstName);

}
