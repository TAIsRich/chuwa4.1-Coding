package com.chuwa.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

public class User implements Serializable {

    private static final long serialUID = 1L;


    private String firstname;

    private String lastname;


    private String username;

    private String password;


    private UserPreference userPreference;

    public String getFirstname() {
        return firstname;
    }

    public User setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public User setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public UserPreference getUserPreference() {
        return userPreference;
    }

    public User setUserPreference(UserPreference userPreference) {
        this.userPreference = userPreference;
        return this;
    }

    public void update(String message){
        System.out.println("Hey, " + firstname + " here is your username " + username + ", " + message);

    }
}
