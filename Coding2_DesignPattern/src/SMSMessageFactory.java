public class SMSMessageFactory implements MessageFactory{
    @Override
    public Message createMessage() {
        return new SMSMessage();
    }
}
