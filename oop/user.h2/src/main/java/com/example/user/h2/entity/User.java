package com.example.user.h2.entity;


import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="USER_TABLE")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="LOGIN_NAME")
    private String loginName;

    public User(String name, String email, String password, String loginName) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.loginName = loginName;
    }

    public User() {

    }


    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
    public String getPassword() {
        return this.password;
    }
    public String getEmail() {
        return this.email;
    }

    public String getLoginName() {
        return loginName;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }


    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.email);
    }

    @Override
    public String toString() {
        return "User {" + "id=" + this.id + ", name='" + this.name + '\'' + ", email='" + this.email + '\'' + '}';
    }


}
