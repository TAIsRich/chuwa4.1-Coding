package com.example.usersystem.exception;

public class UserAlreadyExistException extends RuntimeException {
    public UserAlreadyExistException(String userName) {
        super(String.format("username %s already existed!", userName));
    }
}
