public class Laptop extends PersonalComputer{
    // fields
    boolean isFolded;
    int size;
    int weight;
    boolean outOfBattery;
    boolean isAuthorized;
    String name;

    public Laptop(String userName) {
        super(userName);
    }

    public String getName() {
        return name;
    }

    public Laptop setName(String name) {
        this.name = name;
        return this;
    }

    // methods
    @Override
    public void sleep() {
        System.out.println("you laptop is sleeping");
    }

    public void sleep(boolean isFolded){
        if(isFolded){
            System.out.println("you laptop is going to sleep");
        }
    }

    @Override
    public void restart() {
        System.out.println("your laptop is about to restart");
    }

    @Override
    public String name() {
        return name;
    }

    public void playVideo(){
        System.out.println("playing video");
    }
    // function overloading
    public void playVideo(boolean isAuthorized){
        System.out.println("playing video");
    }


}
