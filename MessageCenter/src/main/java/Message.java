public class Message {
    public static void sendMessage(User user) throws Exception {
        if (user.getEmail() != null) {
            sendEmail(user);
        }

        if (user.getPhoneNo() != null) {
            sendSMS(user);
        }

        if (user.getPhoneNo() == null && user.getEmail() == null) {
            throw new Exception("No contact information for " + user.username);
        }
    }

    public static void sendEmail(User user) {
        System.out.println("Welcome " + user.username + ", this is an email message.");
    }

    public static void sendSMS(User user) {
        System.out.println("Welcome " + user.username + ", this is a SMS message.");
    }
}
