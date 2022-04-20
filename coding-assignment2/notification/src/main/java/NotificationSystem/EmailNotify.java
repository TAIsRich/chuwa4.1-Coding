package NotificationSystem;

import java.util.ArrayList;
import java.util.List;

public class EmailNotify implements Notify {



    private static EmailNotify emailNotify = null ;

    private EmailNotify(){}

    //double lock singleton
    public static EmailNotify getInstance(){
        if (emailNotify==null){
            synchronized (EmailNotify.class){
                if (emailNotify==null){
                    return new EmailNotify();
                }
            }
        }
        return emailNotify;
    }


    @Override
    public void notify(User user) {

        System.out.println("Hey "+user.getFirstName()+" Here is your email "+user.getEmailAddress()+" Please user for future reference!");
                //Hey firstName, you have successfully registered to add and here is your <loginName>, please use this for future references.
        //to do throws null exception or user preference not matched
    }
}
