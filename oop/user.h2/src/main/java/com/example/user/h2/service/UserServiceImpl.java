package com.example.user.h2.service;

import com.example.user.h2.entity.User;
import com.example.user.h2.exceptions.UserAlreadyExistException;
import com.example.user.h2.exceptions.UserNotFoundException;
import com.example.user.h2.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    public UserServiceImpl(UserRepo userRepo) {
        super();
        this.userRepo = userRepo;
    }

    @Override
    public void saveUser(User user) {
        Optional<User> results = userRepo.findById(user.getId());

        if(!results.isEmpty()) {
            throw new UserAlreadyExistException(user.getName());
        }
        userRepo.save(user);
    }

    @Override
    public List<User> getAll() {
        return userRepo.findAll();
    }

    @Override
    public User getUserById(long id) {
        Optional<User> user = userRepo.findById(id);
        if (user.isPresent()) {
            return user.get();
        } else {
            throw new UserNotFoundException("resource", "name", id);
        }
    }

    @Override
    public User updateUser(User user, long id) {
        User user_exist = userRepo.findById(id).orElseThrow(
        () -> new UserNotFoundException("resource", "name", id));

        user_exist.setName(user.getName());
        user_exist.setEmail(user.getEmail());
        user_exist.setPassword(user.getPassword());
        userRepo.save(user_exist);

        return user_exist;

    }

    @Override
    public void deleteUser(long id) {
        userRepo.findById(id).orElseThrow(()->new UserNotFoundException("User", "id", id));
        userRepo.deleteById(id);
    }
}
