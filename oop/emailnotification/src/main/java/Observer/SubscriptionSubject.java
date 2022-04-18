package Observer;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionSubject implements Subject{
    private List<Obs> userList = new ArrayList<Obs>();

    @Override
    public void attach(Obs observer) {
        userList.add(observer);
    }

    @Override
    public void detach(Obs observer) {
        userList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Obs observer : userList) {
            observer.update(message);
        }
    }
}