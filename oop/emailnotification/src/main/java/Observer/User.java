package Observer;

public class User implements Obs{

    private String name;
    private String email;
    private String phonenumber;

    public User(String name, String email, String phonenumber) {
        this.name = name;
        this.email = email;
        this.phonenumber = phonenumber;
    }

    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}
