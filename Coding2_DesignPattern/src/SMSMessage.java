public class SMSMessage extends Message{
    @Override
    public void addStyle() {
        content = "SMS notification: " + content;
    }
}
