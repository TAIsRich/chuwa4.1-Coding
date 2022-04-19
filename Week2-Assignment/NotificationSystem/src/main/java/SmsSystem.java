import java.util.ArrayList;
import java.util.List;

// use singleton pattern for SmsSystem, since we only want one SmsSystem
public  final class SmsSystem implements NotifySystem{
    // private static field
    private static SmsSystem smsSystem = null;
    // private constructor
    private SmsSystem(){
    }

    private static List<User> smsUser = new ArrayList<>();

    // public static methods
    public static SmsSystem getInstance(){
        if(smsSystem == null){
            synchronized (SmsSystem.class){
                if(smsSystem == null){
                    return new SmsSystem();
                }
            }
        }
        return smsSystem;
    }

    @Override
    public void attach(User user) {
        // when adding user, need to check user's preference
        if(user.getPreference() == Preference.SMS){
            smsUser.add(user);
        }else{
            System.out.println("Sorry, " + user.getName() + " preference didn't match");
        }
    }

    @Override
    public void detach(User user) {
        // when deleting, need to check if the user is in the list
        if(smsUser.contains(user)){
            smsUser.remove(user);
        }else{
            System.out.println("Sorry, " + user.getName() + " account is invalid" );
        }
    }

    @Override
    public void notify(String message) {
        for(User user: smsUser){
            user.update(message);
        }
    }
}
