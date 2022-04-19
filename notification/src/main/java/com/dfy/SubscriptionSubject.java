package com.dfy;

import java.util.ArrayList;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/16/22 10:17 PM
 */
public class SubscriptionSubject implements Subject {

    private ArrayList<ConcreteUser> list;

    public SubscriptionSubject() {
        list = new ArrayList<>();
    }



    @Override
    public void add(ConcreteUser concreteuser) {
        list.add(concreteuser);


    }

    @Override
    public void delete(ConcreteUser concreteUser) {
        list.remove(concreteUser);
    }

    @Override
    public void notify(String message) {

        for (ConcreteUser concreteUser : list) {
            concreteUser.update(message);
        }


    }
}
