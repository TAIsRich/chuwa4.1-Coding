package com.restcode.demo.repository;

import com.restcode.demo.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface UserRepository  extends CrudRepository<User, Long> {
    // custom query example and return a stream
    @Query("select u from User userha where u.email = :email")
    List<User> findByEmail(@Param("email") String email);

    @Query("select u from User u where u.loginName = :loginName")
    User findByLogin(@Param("loginName") String loginName);

    @Query("select u from User u where u.id = :id")
    User findById(@Param("id") String id);

//    @Query(value = "select * from userha")
    List<User> findAll();
}
