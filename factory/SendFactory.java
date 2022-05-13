package com.factory;


// factory-create object for mailsender ,smsender
public class SendFactory {

    public Sender getInstance(String type){
        if("mail".equals(type)){
            return new MailSender("shirley","shirleyshen");
        }
        else if("sms".equals(type)){
            return new SmsSender("shirley","shirleyshen");
        }else{
            System.out.println("please check your input type");
            return null;
        }

    }
}
