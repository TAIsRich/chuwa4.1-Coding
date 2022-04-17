public class MessageSender {    //CoffeeStore
    private MessageFactory factory;

    public void setFactory(MessageFactory factory){
        this.factory = factory;
    }

    public Message customizeMessage(){
        Message message = factory.createMessage();
        message.setContent();
        message.addStyle();
        return message;
    }

    public static String getMessageContent(Preference preference){
        if(preference == Preference.email){
            MessageSender messageSender = new MessageSender();
            MessageFactory factory = new EmailMessageFactory();
            messageSender.setFactory(factory);
            Message message = messageSender.customizeMessage();
            return message.content;
        }
        else{
            MessageSender messageSender = new MessageSender();
            MessageFactory factory = new SMSMessageFactory();
            messageSender.setFactory(factory);
            Message message = messageSender.customizeMessage();
            return message.content;
        }
    }

}