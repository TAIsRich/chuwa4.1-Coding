public class client {
    public static void main(String[] args) {

        iyoutube cyoulist = new cnotify("Apple");
        iviewer user1 = new cviewer("Jay", "native");
        iviewer user2 = new cviewer("Jack", "email");
        iviewer user3 = new cviewer("May", "emxxail");
        cyoulist.attach(user1);
        cyoulist.attach(user2);
        cyoulist.attach(user3);
        cyoulist.Notify("new video is upload");

    }
}
