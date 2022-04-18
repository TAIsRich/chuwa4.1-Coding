import java.util.UUID;

public class User implements Observer {
    private UUID id;
    private String name;
    private String login;
    private NotificationChannel notificationChannel;

    public User(String name, NotificationChannel notificationChannel) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.login = id + "@mail.com";
        this.notificationChannel = notificationChannel;
    }

    @Override
    public void update(String message) {
        String formattedMessage = message.replace("{1}", name).replace("{2}", login);
        notificationChannel.send(formattedMessage);
    }

    @Override
    public UUID getId() {
        return id;
    }
}
