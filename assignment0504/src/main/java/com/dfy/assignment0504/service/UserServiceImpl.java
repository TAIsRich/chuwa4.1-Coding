package com.dfy.assignment0504.service;

import com.dfy.assignment0504.entity.User;
import com.dfy.assignment0504.exception.EmailHasRegisteredException;
import com.dfy.assignment0504.exception.UserNotFoundException;
import com.dfy.assignment0504.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 5/11/22 3:07 PM
 */
@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private HashSet<String> registeredEmails;

    private HashMap<Long, String> validationMap;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.registeredEmails = new HashSet<>();
        this.validationMap = new HashMap<>();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        if (isRegistered(user.getEmail())) {
            throw new EmailHasRegisteredException();
        }
        else {
            registeredEmails.add(user.getEmail());
            validationMap.put(user.getId(), user.getUsername());
            return userRepository.save(user);
        }
    }

    @Override
    public User searchUserById(Long id) {
//        Optional<User> user = userRepository.findById(id);
//        if (user.isPresent()) return user.get();
//        else throw new UserNotFoundException(id);

        User existingUser = userRepository.findById(id).orElseThrow(()->
                new UserNotFoundException("Could not find user " + id));

        return existingUser;


    }

    @Override
    public User updateUser(User user, Long id) {
        User existingUser = userRepository.findById(id).orElseThrow(()->
                new UserNotFoundException("Could not find user " + id));
        if (isRegistered(user.getEmail())) throw new EmailHasRegisteredException();


        existingUser.setUsername(user.getUsername());
        existingUser.setEmail(user.getEmail());

        registeredEmails.add(existingUser.getEmail());
        validationMap.replace(id, user.getUsername());
        userRepository.save(existingUser);

        return existingUser;
    }

    @Override
    public void deleteUser(Long id) {
        User existingUser = userRepository.findById(id).orElseThrow(()->
                new UserNotFoundException("Could not find user " + id));
        registeredEmails.remove(existingUser.getEmail());
        validationMap.remove(id, existingUser.getUsername());
        userRepository.deleteById(id);

    }

    @Override
    public boolean isRegistered(String email) {
        return registeredEmails.contains(email);
    }

    @Override
    public boolean login(Long id, String firstName) {
        if (validationMap.containsKey(id) && validationMap.get(id) == firstName) return true;
        else return false;
    }
}

