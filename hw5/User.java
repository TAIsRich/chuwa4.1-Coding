package Chuwa;

//Define a specific-observer-class,users are observers,
//and implemented an update method.
public class User implements Observer{
    private String name;
    private int type;//preference type 1= message 2=email
    public  User(String name, int type) {
        this.name = name;
        this.type = type;
    }
    public void update(String message) {
        System.out.println(name + " " + message);
    }
    public int getPreferenceType(){
        return this.type;
    }
}