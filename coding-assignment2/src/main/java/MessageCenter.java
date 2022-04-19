public final class MessageCenter {

    private MessageCenter() {}

    private static volatile MessageCenter instance;

    public static MessageCenter getInstance() {
        if (instance == null) {
            synchronized (MessageCenter.class) {
                if (instance == null) {
                    instance = new MessageCenter();
                }
            }
        }
        return instance;
    }

    public String generateMessage(UserInfo user) {
        Message mssg = MessageFactory.createMessage(user);
        mssg.setText(user.getFirstName(), user.getLoginName());
        return mssg.getText();
    }
}
