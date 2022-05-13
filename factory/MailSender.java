package com.factory;

public class MailSender implements Sender{
    private String FirstName;
    private String LoginName;

    public String getLoginName() {
        return LoginName;
    }

    public MailSender() {
    }

    public MailSender(String FirstName,String LoginName) {
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
        System.out.println(getFirstName()+" you have successfully registered to add and here is your  username "+getLoginName()+"please use this for future references" +
                "");
    }
}
