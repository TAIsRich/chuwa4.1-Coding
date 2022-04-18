public abstract class Message {
    private String content;

    public abstract String getPreference();

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
