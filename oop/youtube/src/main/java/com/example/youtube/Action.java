package com.example.youtube;

public interface Action {
    public void addUser(User user);
    public void deleteUser(User user);
    public void addContent(Content content);
    public void deleteContent(Content content);
}
