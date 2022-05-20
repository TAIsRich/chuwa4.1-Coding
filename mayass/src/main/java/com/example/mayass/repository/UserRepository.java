package com.example.mayass.repository;

import com.example.mayass.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByRole(String role);
    User findById(long id);
    User findByIdAndPassword(long id, String password);

    @Query("select u from User u where u.name = :loginName")
    User findByLogin(@Param("loginName") String loginName);

    List<User> findAll();

//    public boolean existsByUsername(String username);
//    public User findUserById(Long id);
}
