package com.example.helloworld;

public class HelloworldApplication {
    private final long id;
    private final String content;


    public HelloworldApplication(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
