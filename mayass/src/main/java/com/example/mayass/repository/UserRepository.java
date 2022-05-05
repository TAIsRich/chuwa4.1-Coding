package com.example.mayass.repository;

import com.example.mayass.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByRole(String role);
    User findById(long id);
    User findByIdAndPassword(long id, String password);
//    public boolean existsByUsername(String username);
//    public User findUserById(Long id);
}
