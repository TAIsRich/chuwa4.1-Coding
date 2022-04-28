package com.company.notificationSystem;


public class Client {

    public static void main(String[] args) {


        User user1= new User("David","Love");

        user1.setPreference(Preference.Email);
        user1.setEmailAddress("davidlove@gmail.com");

        EmailNotification emailNotification = EmailNotification.getInstance();

        SMSNotification smsNotification = SMSNotification.getInstance();
        PushNotification pushNotification = PushNotification.getInstance();

        emailNotification.sendNotification(user1);


        User user2= new User("Marla","Lee");
        user2.setPhoneNumber("999999999");
        smsNotification.sendNotification(user2);

        User user3= new User("Josh","Smith");
        user1.setPreference(Preference.Push);
        pushNotification.sendNotification(user3);










    }
}
