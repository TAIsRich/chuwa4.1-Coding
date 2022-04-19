public class MessageFactory {

    public static Message createMessage(UserInfo user) {
        Message message = null;
        if ("SMS".equals(user.getType())) {
            message = new SMSMessage();
        } else if ("Email".equals(user.getType())) {
            message = new EmailMessage();
        } else {
            throw new RuntimeException(user.getType() + " dose not exist!");
        }
        return message;
    }
}
