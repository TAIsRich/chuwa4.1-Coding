package com.example.code1.repository;

import com.example.code1.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface UserMapper {
    @Select("select * from user where username = #{username} and password =#{password}")
    User selectByUandP(@Param("username") String username, @Param("password") String password, @Param("balance") String balance);

    @Select("select * from user where username = #{username}")
    User selectByU(@Param("username") String username);
}

/*
public interface UserMapper extends JpaRepository<User, Integer> {
    @Query(value = "select * from user where username = #{username} and password =#{password}", nativeQuery = true)
    User selectByUandP(@Param("username") String username, @Param("password") String password, @Param("balance") String balance);

    @Query(value = "select * from user where username = #{username}", nativeQuery = true)
    User selectByU(@Param("username") String username);
}
*/
