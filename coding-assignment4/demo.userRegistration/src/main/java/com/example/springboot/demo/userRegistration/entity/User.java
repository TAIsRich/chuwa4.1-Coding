package com.example.springboot.demo.userRegistration.entity;

import com.example.springboot.demo.userRegistration.entity.listener.UserListener;

import javax.persistence.*;

@Entity
@EntityListeners({UserListener.class})
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long  userId;

    @Column(name="USER_NAME")
    private String userName;
    @Column(name="USER_EMAIL")
    private String userEmail;
    @Column(name="USER_PASSWORD")
    private String userPassword;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
