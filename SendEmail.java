public class SendEmail {
    public interface Notification {
        public void sendNotification(NotificationModel notif);
    }
    public class NotificationModel {
        private String to;
        private String from;
        private String msg;
        private String firstname;

        // Getters and Setters Here ...

        public NotificationModel(String to, String from, String msg, String firstName) {
            this.to = to;
            this.from = from;
            this.msg = msg;
            this.firstname = firstName;
        }

        @Override
        public String toString() {
            return msg +
                    " is sent to " +
                    to +
                    " from " +
                    from;
        }
    }
    public class EMailNotification implements Notification {

        @Override
        public void sendNotification(NotificationModel notif) {
            System.out.println("E-Mail Notification is going out\n" +
                    notif +
                    "\n");

        }

    }
    public class SMSNotification implements Notification {

        @Override
        public void sendNotification(NotificationModel notif) {
            System.out.println("SMS Notification is going out\n" +
                    notif +
                    "\n");

        }

    }
    public class PushNotification implements Notification {

        @Override
        public void sendNotification(NotificationModel notif) {
            System.out.println("Hey"+ notif.firstname+", you have successfully registered to add and here is your <loginName>, please use this for future references.");

        }

    }
    public enum NotificationType {
        SMS, EMAIL, PUSH
    }
    public class NotificationFactory {
        public Notification createNotification(NotificationType type) {
            Notification notification;
            switch(type) {
                case EMAIL:
                    notification = new EMailNotification();
                    break;
                case PUSH:
                    notification = new PushNotification();
                    break;
                case SMS:
                default:
                    notification = new SMSNotification();
                    break;
            }
            return notification;
        }
    }

}