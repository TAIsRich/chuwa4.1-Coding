package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    public boolean existsById(long id);

    public User findById(long id);

    public boolean existsByLoginName(String loginName);

    public User findByLoginName(String username);
}