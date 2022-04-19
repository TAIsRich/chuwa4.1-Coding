package com.dfy;

/**
 * @description: some desc
 * @author: FY Dong
 * @date: 4/16/22 10:16 PM
 */
public interface Subject {

    void add(ConcreteUser concreteuser);

    void delete(ConcreteUser concreteUser);

    void notify(String message);



}
