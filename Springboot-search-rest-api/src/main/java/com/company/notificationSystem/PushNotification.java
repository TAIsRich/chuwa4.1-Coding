package com.company.notificationSystem;

public class PushNotification implements sendNotification{
    private PushNotification(){}

    private static PushNotification pushNotification=null;

    public static PushNotification getInstance() {
        if (pushNotification == null) {
            synchronized (PushNotification.class) {
                if (pushNotification == null) {
                    return new PushNotification();
                }
            }
        }
        return pushNotification;


    }
    @Override
    public void sendNotification() {
        System.out.println("You will get notification via Push in the future");
    }

    @Override
    public void sendNotification(User user) {

        System.out.println("You will get notification via Push in the future");
    }
}
