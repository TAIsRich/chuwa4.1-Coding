package Observer;

public class Client {

    public static void main(String [] args) {
        SubscriptionSubject subject = new SubscriptionSubject();
        subject.attach(new User("Adam", "adam@gmail.com", "6071238902"));
        subject.attach(new User("Alex", "alex@gmail.com", "6089087652"));
        subject.attach(new User("Abraham", "abraham@gmail.com", "7039802682"));

        subject.notify("Updated");
    }
}
