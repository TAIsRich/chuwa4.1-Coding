package homework;

public class TelObserver implements Observer {

    @Override
    public void sendMessage(User user){
        if (user.getTell()!=null&& !user.getTell().equals("")) {
            System.out.println("this is tel message");
            System.out.println("hi" + user.getName() + ",register success ,this is your loginName:" + user.getUserName());
        }
    }
}

