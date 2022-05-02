package com.example.user.h2.repository;

import com.example.user.h2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<User, Long> {

    List<User> findByEmail(User email);

    public void addUser(String name, String password, String email);
    public void editUser(Long id);
    public void removeUser(Long id);

}
