package com.dfy;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/16/22 10:09 PM
 */
public class ClientTest {
    public static void main(String[] args) {
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();

        ConcreteUser user1 = new ConcreteUser("Yuan", "dfy2022", "hello123");
        ConcreteUser user2 = new ConcreteUser("zlz", "dfy", "hello1");
        ConcreteUser user3 = new ConcreteUser("Fang", "dfy222", "hello");

        subscriptionSubject.add(user1);
        subscriptionSubject.add(user2);
        subscriptionSubject.add(user3);

        subscriptionSubject.notify(", you have an update!");

    }
}
