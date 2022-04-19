package com.company;


public class EmailNotification implements sendNotification {

    @Override
    public void sendNotification() {
        System.out.println("You will get notification and update via Email in the future");
    }
}
