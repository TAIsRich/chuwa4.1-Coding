public class EmailNotificationChannel implements NotificationChannel {
    private static final String NAME = "EMAIL";

    @Override
    public void send(String message) {
        System.out.printf(NAME + ": " + message + '\n');
    }
}
