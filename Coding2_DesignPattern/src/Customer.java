public class Customer implements Observer{
    private String firstName;
    private String lastName;
    private Preference preference;

    public Customer(String firstName, String lastName, Preference preference){
        this.firstName = firstName;
        this.lastName = lastName;
        this.preference = preference;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public Preference getPreference(){
        return preference;
    }

    @Override
    public void update() {
        System.out.println(firstName + " - " + MessageSender.getMessageContent(preference));
    }
}
