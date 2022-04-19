public class SMSMessage implements Message {

    private String text;

    @Override
    public void setText(String firstName, String loginName) {
        text = "Hey " + firstName + ", you have successfully registered to add and here is your " + loginName + ", please use this for future references.";
    }

    @Override
    public String getText() {
        return text;
    }
}
