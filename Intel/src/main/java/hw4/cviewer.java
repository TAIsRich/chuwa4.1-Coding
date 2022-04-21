package hw4;

public class cviewer implements iviewer {
    private String name;
    private String preference;
    private String email;
    private String phone;

    cviewer(String name, String preference, String temp) {
        this.name = name;
        this.preference = preference;
        if (phoneoremail.instance.isnum(temp) == true )
            this.phone = temp;
        else
            this.email = temp;

    }

    @Override
    public String getname() {
        return name;
    }

    @Override
    public String getPreference() {
        return preference;
    }

    @Override
    public void update(String message) {
        System.out.println(preference + ": hello " + name + " " + message);
    }

    @Override
    public String getphone() {
        return phone;
    }

    @Override
    public String getEmail() {
        return email;
    }

}
