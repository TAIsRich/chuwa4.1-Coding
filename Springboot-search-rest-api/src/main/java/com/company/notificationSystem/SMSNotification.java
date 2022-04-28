package com.company.notificationSystem;

public class SMSNotification implements sendNotification{
    private SMSNotification(){}

    private static SMSNotification smsNotification=null;

    public static SMSNotification getInstance() {
        if (smsNotification == null) {
            synchronized (SMSNotification.class) {
                if (smsNotification == null) {
                    return new SMSNotification();
                }
            }
        }
        return smsNotification;


    }

    @Override
    public void sendNotification() {
        System.out.println("You will get notification and update via SMS in the future");
    }

    @Override
    public void sendNotification(User user) {
        System.out.println("You will get notification and update via SMS in the future");

    }
}
