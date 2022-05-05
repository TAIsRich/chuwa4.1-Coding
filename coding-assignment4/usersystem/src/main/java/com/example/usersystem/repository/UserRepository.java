package com.example.usersystem.repository;

import com.example.usersystem.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    public List<User> findByUserName(String userName);
    // public Boolean findByUserNameIsNull(String userName);
}
