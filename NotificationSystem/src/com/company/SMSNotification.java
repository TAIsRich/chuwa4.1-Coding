package com.company;

public class SMSNotification implements sendNotification{
    @Override
    public void sendNotification() {
        System.out.println("You will get notification via SMS in the future");
    }
}
