package com.example.springboot.demo.userRegistration.repository;

import com.example.springboot.demo.userRegistration.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    @Override
    <S extends User> S save(S entity);


    @Query("SELECT u from User u WHERE "+ //using class name
            "u.userName LIKE CONCAT('%',:query,'%')")
    List<User> searchUsers(String query);
}
