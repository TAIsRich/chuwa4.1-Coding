package com.qiyun.notif.service;

public class UserException extends Exception{
    static final long serialVersionUID = -33875169124229948L;

    public UserException(){}

    public UserException(String message) {
        super(message);
    }
}
