public class SMSNotificationChannel implements NotificationChannel {
    private static final String NAME = "SMS";

    @Override
    public void send(String message) {
        System.out.printf(NAME + ": " + message + '\n');
    }
}
