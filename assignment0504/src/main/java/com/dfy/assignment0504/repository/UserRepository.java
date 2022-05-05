package com.dfy.assignment0504.repository;

import com.dfy.assignment0504.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 5/4/22 9:43 AM
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
