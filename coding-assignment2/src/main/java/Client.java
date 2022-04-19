public class Client {
    public static void main(String args[]) {
        UserInfo user = new UserInfo();
        user.setFirstName("alex_first_name");
        user.setLoginName("alex_login_name");
        user.setType("SMS");
        MessageCenter messageCenter = MessageCenter.getInstance();
        System.out.println(messageCenter.generateMessage(user));
    }
}
