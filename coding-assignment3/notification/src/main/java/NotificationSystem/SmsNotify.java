package NotificationSystem;

public class SmsNotify implements Notify {


    private SmsNotify(){}

    private static SmsNotify smsNotify=null;

    public static SmsNotify getInstance(){
        if (smsNotify==null){
            synchronized ( SmsNotify.class){
                if (smsNotify==null){
                    return new SmsNotify();
                }
            }
        }
        return smsNotify;
    }


    @Override
    public void notify(User user) {

        System.out.println("Hey "+user.getFirstName()+" Here is your sms number "+user.getPhoneNumber()+" Please user for future reference! ");

        //to do throws null exception or user preference not matched
    }


}
