public class Client {
    public static void main(String[] args) {
        User user1 = new User("Richard", Preference.EMAIL);
        User user2 = new User("Lucia", Preference.SMS);
        User user3 = new User("Nara", Preference.SMS);

        user1.setUsername("rich");
        user2.setUsername("lulu");
        user3.setUsername("AGN");
        SmsSystem smsSystem = SmsSystem.getInstance();
        EmailSystem emailSystem = EmailSystem.getInstance();

        smsSystem.attach(user1);
        smsSystem.attach(user2);
        smsSystem.attach(user3);
        emailSystem.attach(user1);
        emailSystem.attach(user2);
        emailSystem.attach(user3);
        smsSystem.detach(user1);
        emailSystem.detach(user3);

        emailSystem.notify("you have successfully registered, please use this for future references." );
        smsSystem.notify("you have successfully registered, please use this for future references.");
    }
}
