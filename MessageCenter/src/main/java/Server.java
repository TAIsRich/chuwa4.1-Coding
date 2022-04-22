import java.util.*;

public class Server {
    private List<User> userList = new ArrayList<>();

    public Server() {}

    public void addUser(User user) {
        userList.add(user);
    }

    public void removeUser(User user) {
        userList.remove(user);
    }

    public void sendMessage() throws Exception {
        for (User user: userList) {
            Message.sendMessage(user);
        }
    }
}
