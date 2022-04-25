package com.company.notificationSystem;

public class EmailNotification implements sendNotification {
    private static EmailNotification emailNotify = null ;

    private void EmailNotificationy(){}

    public static EmailNotification getInstance(){
        if (emailNotify==null){
            synchronized (EmailNotification.class){
                if (emailNotify==null){
                    return new EmailNotification();
                }
            }
        }
        return emailNotify;
    }

    @Override
    public void sendNotification() {
        System.out.println("You will get notification and update via Email in the future");
    }

    @Override
    public void sendNotification(User user) {
        System.out.println("You will get notification and update via Email in the future");
    }
}