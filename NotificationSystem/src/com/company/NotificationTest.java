package com.company;

public class NotificationTest {

    public static void main(String[] args) {
        try {
            NotificationFactory notificationFactory = new NotificationFactory();
            sendNotification notification = notificationFactory.createNotification("EMAIL");
            notification.sendNotification();
        }catch (Exception e) {
            System.out.println("Failed to send notification, please input correct type");
        }

    }
}
