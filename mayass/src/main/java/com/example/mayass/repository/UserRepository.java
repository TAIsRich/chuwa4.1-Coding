package com.example.mayass.repository;

import com.example.mayass.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
//    public boolean existsByUsername(String username);
//    public User findUserById(Long id);
}
