package Chuwa;

public class Client {
    public static void main(String[] args) {

        SubscriptionSubject mSubscriptionSubject = new SubscriptionSubject();

        User user1 = new User("John Smith",1);

        User user2 = new User("Mac Miller",1);

        User user3 = new User("Lana Del Ray",2);

        mSubscriptionSubject.attach(user1);

        mSubscriptionSubject.attach(user2);

        mSubscriptionSubject.attach(user3);

        mSubscriptionSubject.notify(" The youtuber you followed updated a new video!");
        }
    }


