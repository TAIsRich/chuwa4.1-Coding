package homework;


/**
 *
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void register(User user);
}
