package com.factory;

public class SmsSender implements Sender{
    private String FirstName;
    private String LoginName;

    public SmsSender() {
    }

    public String getLoginName() {
        return LoginName;
    }



    public SmsSender(String FirstName,String LoginName) {
        this.FirstName = FirstName;
        this.LoginName=LoginName;
    }


    public String getFirstName() {
        return FirstName;
    }



    @Override
    public String getName() {
        return this.FirstName;
    }

    @Override
    public void send() {
        System.out.println("Firstname"+getFirstName()+" "+"Login"+getLoginName());
    }
}
