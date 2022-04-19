package com.example.code1.repository;

import org.apache.ibatis.annotations.Param;
import com.example.code1.entity.User;
import org.hibernate.sql.Update;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//建立接口，不用管，反正他写好了，能用就可以
public interface UserRepository extends JpaRepository<User, Integer>{
    @Query(value = "SELECT * from user", nativeQuery = true)
    List<User> getAll();

    @Query(value = "select * from user where username = #{username}", nativeQuery = true)
    User selectByU1(@Param("username") String username);

    @Query(value = "update user SET balance = #{bal} where username = #{username}", nativeQuery = true)
    User UpdateByU(@Param("username") String username, @Param("balance") String balance);
}
