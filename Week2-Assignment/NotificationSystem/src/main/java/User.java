public class User implements Observer{

    private String name;
    private Preference preference;
    private String username;

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public Preference getPreference() {
        return preference;
    }

    public User setPreference(Preference preference) {
        this.preference = preference;
        return this;
    }



    public User(String name, Preference preference) {
        this.name = name;
        this.preference = preference;
    }

    @Override
    public void update(String message) {
        System.out.println("Hey, " + name + " here is your username " + username + ", " + message);
    }
}
