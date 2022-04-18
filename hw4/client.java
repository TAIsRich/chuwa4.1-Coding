
public class client {
    public static void main(String[] args) {

        iyoutube sms = new sms();
        iyoutube email = new email();
        cviewer user1 = new cviewer("Jay", "sms", "9176281702");
        cviewer user2 = new cviewer("May", "email", "May@mail.com");
        cviewer user3 = new cviewer("Jack", "sms", "917ss6281702");
        sms.attach(user1);
        email.attach(user2);

        email.attach(user3);

        user3 = new cviewer("Jack", "email", "917ss6281702");
        email.attach(user3);

        sms.Notify("new video is upload");
        email.Notify("new video is upload");
    }
}
