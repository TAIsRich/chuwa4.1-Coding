package com.company;

public class PushNotification implements sendNotification{
    @Override
    public void sendNotification() {
        System.out.println("You will get notification via Push in the future");
    }
}
