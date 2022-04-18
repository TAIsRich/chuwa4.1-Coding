public class cviewer implements iviewer {
    private String name;
    private String preference;

    cviewer(String name, String preference) {
        this.name = name;
        this.preference = preference;
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

}
