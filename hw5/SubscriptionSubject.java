package Chuwa;
import java.util.ArrayList;

class SubscriptionSubject implements Subject {
    private ArrayList<Observer> Userlist = new ArrayList<Observer>();
    @Override
    public void attach(Observer observer) {
        Userlist.add(observer);
    }
        @Override
        public void detach(Observer observer) {
            Userlist.remove(observer);
        }
        @Override
        public void notify(String message){
            for (Observer observer : Userlist) {
                if(observer.getPreferenceType() == 1){
                    observer.update("Email sent:" + message);
                }else {
                    observer.update("Text message sent:" + message);
                }
                }


            }
        }

