package com.example.user.h2.repository;

import com.example.user.h2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    public Boolean existsUserByEmail(String email);
    public User findUserById(Long userId);
    List<User> findAll();

    User findByLogin(String username);
}
