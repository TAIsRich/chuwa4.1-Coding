

public class MessageSender {
    private MessageFactory factory;
    private  Customer customer;

    public void setFactory(MessageFactory factory) {
        this.factory = factory;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Message customerMessage(){
        Message message = factory.creatMessage();
        message.setContent("Hey " + customer.getFirstName()
                + ", you have successfully registered to add and here is your login name: "
                + customer.getLoginName()
                + ". please use this for future references." + message.getPreference());
        return message;
    }


}

