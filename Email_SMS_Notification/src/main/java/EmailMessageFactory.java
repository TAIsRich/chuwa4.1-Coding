public class EmailMessageFactory implements MessageFactory{

    @Override
    public Message creatMessage() {
        return new EmailMessage();
    }
}
