public class Client {
    public static void main(String[] args) throws Exception {
        Server server = new Server();

        User user1 = new User("user1");
        user1.setEmail("user1@gmail.com");
        User user2 = new User("user2");
        user2.setPhoneNo("(123)456-7890");
        User user3 = new User("user3");
        user3.setEmail("user3@gmail.com");
        user3.setPhoneNo("(456)789-1234");
        User user4 = new User("user4");

        server.addUser(user1);
        server.addUser(user2);
        server.addUser(user3);
        server.addUser(user4);

        server.sendMessage();
    }
}
