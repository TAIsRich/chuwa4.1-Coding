public class Customer implements Observer{
    private String firstName;
    private String loginName;
    private String preference;

    public Customer(String firstName, String loginName, String preference) {
        this.firstName = firstName;
        this.loginName = loginName;
        this.preference = preference;
    }

    @Override
    public void update(Message message) {
        System.out.println(message.getContent());

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLoginName() {
        return loginName;
    }

    public String getPreference() {
        return preference;
    }
}

