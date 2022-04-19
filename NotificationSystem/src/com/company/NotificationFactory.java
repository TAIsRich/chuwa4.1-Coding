package com.company;

public class NotificationFactory {
    public sendNotification createNotification(String type)
    {

        if ("SMS".equals(type)) {
            return new SMSNotification();
        }
        else if ("EMAIL".equals(type)) {
            return new EmailNotification();
        }
        else if ("PUSH".equals(type)) {
            return new PushNotification();
        }else {
            System.out.println("Unknown type");
            return null;
        }

    }
}

