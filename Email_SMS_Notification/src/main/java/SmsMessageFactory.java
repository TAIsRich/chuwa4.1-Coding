public class SmsMessageFactory implements MessageFactory{

    @Override
    public Message creatMessage() {
        return new SmsMessage();
    }
}
