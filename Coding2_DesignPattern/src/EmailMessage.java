public class EmailMessage extends Message{
    @Override
    public void addStyle() {
        content = "Email notification: " + content;
    }
}


