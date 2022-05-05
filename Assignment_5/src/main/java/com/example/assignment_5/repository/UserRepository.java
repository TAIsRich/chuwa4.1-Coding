package com.example.assignment_5.repository;

import com.example.assignment_5.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    public List<User> findByUserName(String userName);

    Object save(User user);
    void delete(User user);
}