import java.util.ArrayList;
import java.util.List;


public class SubscriptionSubject implements Subject{
    private List<Observer> customerList = new ArrayList<Observer>();

    public SubscriptionSubject() {
        super();
    }

    @Override
    public void attach(Observer observer) {
        customerList.add(observer);

    }

    @Override
    public void detach(Observer observer) {
        customerList.remove(observer);

    }

    @Override
    public void notify(Message message) {
        for (Observer observer : customerList) {
            observer.update(message);
        }

    }
}

