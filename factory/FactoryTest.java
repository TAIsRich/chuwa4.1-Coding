package com.factory;

public class FactoryTest {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.getInstance("email");
        sender.send();
    }
}
