// function as subject role
public interface NotifySystem {
    // add more observer in the subject list
    public void attach(User user);

    // delete more observer int the subject list
    public void detach(User user);

    // when updates happens, send notification
    public void notify(String message);
}
