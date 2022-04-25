package com.example.restserviceproject.models;

public class Tweet {
    private int id;
    private String message;

    public Tweet(int id, String message) {
        this.id = id;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}
