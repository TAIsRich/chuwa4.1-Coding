package com.chuwa.demo.repository;

import com.chuwa.demo.entity.User;
import com.chuwa.demo.entity.UserPreference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotifyRepository extends JpaRepository<User, Long> {
    List<User> findByUserPreference(UserPreference user);
    User findUserBySerialUID( Long userId);
}
