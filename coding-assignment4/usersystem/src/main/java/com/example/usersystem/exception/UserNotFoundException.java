package com.example.usersystem.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String userName) {
        super(String.format("user name '%s' not found!", userName));
    }
}
