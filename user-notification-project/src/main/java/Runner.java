public class Runner {
    public static void main(String[] args) {
        String messageTemplate = "Hey {1}, you have successfully registered to add and here is your {2}, please use this for future references.";

        NotificationChannel emailNotificationChannel = new EmailNotificationChannel();
        NotificationChannel smsNotificationChannel = new SMSNotificationChannel();

        User jack = new User("jack", emailNotificationChannel);
        User rose = new User("rose", smsNotificationChannel);

        Subject subject = new SubscriptionSubject();
        subject.attach(jack);
        subject.attach(rose);
        subject.notify(messageTemplate);
    }
}
