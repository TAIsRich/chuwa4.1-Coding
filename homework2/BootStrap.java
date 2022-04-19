package homework;

public class BootStrap {
    public static void main(String[] args){
        ConcreteSubject subject = new ConcreteSubject();
        subject.registerObserver(new TelObserver());
        subject.registerObserver(new EmailObserver());
        User telUser = new User("jack", "jackLogin", "888888", "", "root");
        User emailUser = new User("sam", "samLogin", "", "sam@google.com", "root");
        subject.register(telUser);
        subject.register(emailUser);
    }
}

