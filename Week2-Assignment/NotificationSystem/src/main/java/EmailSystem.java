import java.util.ArrayList;
import java.util.List;

// we need to make EmailSystem as Singleton, so we can only have one instance of EmailSystem
public final class EmailSystem implements NotifySystem{

    private List<User> emailUser = new ArrayList<>();
    // private static field
    private static EmailSystem emailSystem = null;

    // private constructor
    private EmailSystem(){}

    // public static method using double-lock to make sure multi-threading safe
    public static EmailSystem getInstance(){
        if(emailSystem == null){
            synchronized (EmailSystem.class){
                if(emailSystem == null){
                    return new EmailSystem();
                }
            }
        }
        return emailSystem;
    }
    @Override
    public void attach(User user) {
        if(user.getPreference() == Preference.EMAIL){
            emailUser.add(user);
        }else{
            System.out.println("Sorry, " + user.getName() + " preference didn't match");
        }

    }

    @Override
    public void detach(User user) {
        if(emailUser.contains(user)){
            emailUser.remove(user);
        }else{
            System.out.println("Sorry, " + user.getName() + " account is invalid");
        }
    }

    @Override
    public void notify(String message) {
        for(User user: emailUser){
            user.update(message);
        }
    }
}
