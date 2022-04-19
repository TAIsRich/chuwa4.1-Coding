public abstract class Message {
    protected String content;

    public abstract void addStyle();

    public void setContent(){
        content = "The annual fee has been debited from your account.";
    }

    public String getContent(){
        return content;
    }
}
