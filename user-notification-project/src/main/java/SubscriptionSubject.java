import java.util.ArrayList;
import java.util.List;

public class SubscriptionSubject implements Subject {
    private List<Observer> observerList;

    public SubscriptionSubject() {
        observerList = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer o) {
        observerList.removeIf(observer -> observer.getId() == o.getId());
    }

    @Override
    public void notify(String message) {
        observerList.forEach(observer -> observer.update(message));
    }
}
