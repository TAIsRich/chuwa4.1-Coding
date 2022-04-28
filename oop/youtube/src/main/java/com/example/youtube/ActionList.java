package com.example.youtube;

import java.util.ArrayList;
import java.util.List;

public class ActionList implements Action{

    private List<User> userList = new ArrayList<User>();
    private List<Content> contentList = new ArrayList<Content>();

    @Override
    public void addUser(User user) {
        userList.add(user);
    }

    @Override
    public void deleteUser(User user) {
        userList.remove(user);
    }

    @Override
    public void addContent(Content content) {
        contentList.add(content);
    }


    @Override
    public void deleteContent(Content content) {
        contentList.remove(content);
    }

    public ArrayList contentOfList() {
        return (ArrayList) contentList;
    }

    public ArrayList userOfList() {
        return (ArrayList) userList;
    }

}
