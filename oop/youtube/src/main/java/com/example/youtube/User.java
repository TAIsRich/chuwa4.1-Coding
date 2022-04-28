package com.example.youtube;

public class User {
    private String username;
    private String password;

    public User(String name, String pwd) {
        this.username = name;
        this.password = pwd;
    }

    public void setUsername(String name) {
        this.username = name;
    }

    public void setPassword(String password1) {
        this.password = password1;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

}
