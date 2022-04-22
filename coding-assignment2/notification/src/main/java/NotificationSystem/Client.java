package NotificationSystem;

public class Client {

    public static void main(String[] args) {


        User user1= new User("Huan","Wang");

        user1.setPreference(Preference.Sms);
        user1.setEmailAddress("huanwang@universe.com");

        EmailNotify emailNotification = EmailNotify.getInstance();

        SmsNotify smsNotify = SmsNotify.getInstance();

        smsNotify.notify(user1);


        User user2= new User("John","Smith");
        user2.setPhoneNumber("123456789");

        smsNotify.notify(user2);





    }
}
