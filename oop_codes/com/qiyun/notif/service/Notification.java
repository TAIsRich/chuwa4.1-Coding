package com.qiyun.notif.service;

import com.qiyun.notif.domain.User;

public class Notification {
    private final int MAX_SEND_NUM = 5;
    private User[] team = new User[MAX_SEND_NUM];
    private int total;

    public Notification() {
        super();
    }

    public void sendEmail(User u){

        u.sendEmail();
    }
}
