package Observer;

public interface Subject {

    //add subscriber
    public void attach(Obs observer);

    public void detach(Obs observer);

    public void notify(String message);
}
