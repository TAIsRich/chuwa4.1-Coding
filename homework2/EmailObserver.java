package homework;

public class EmailObserver implements Observer {

    @Override
    public void sendMessage(User user){
        if (user.getEmail() != null && !user.getEmail().equals("")) {
            System.out.println("this is email message");
            System.out.println("hi" + user.getName() + ",register success ,this is your loginName:" + user.getUserName());
        }
    }
}

