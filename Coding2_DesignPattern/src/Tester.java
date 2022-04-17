import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args){
        List<Customer> customerList = new ArrayList<Customer>();
        customerList.add(new Customer("Lifan", "Zeng", Preference.email));
        customerList.add(new Customer("Mary", "Chen", Preference.SMS));
        customerList.add(new Customer("Mike", "Blue", Preference.SMS));
        customerList.add(new Customer("Bing", "Wong", Preference.email));

        SubscriptionSubject subject = new SubscriptionSubject();
        for(int i=0; i< customerList.size(); i++){
            subject.attach(customerList.get(i));
        }

        subject.notifies();
    }
}
