public abstract class PersonalComputer implements Computer {
    //fields:
    private String userName;
    public String brand;
    public String operatingSystem;
    public boolean portable;
    public int size;

    public PersonalComputer(String userName) {
        this.userName = userName;
    }

    // methods
    public void playMusic(String username){
        System.out.println("music is on");
    }

    public void viewPhotos(String username){
        System.out.println("photos are ready");
    }

    @Override
    public void start(){
        System.out.println("pc is on");
    }

    @Override
    public void powerOff(){
        System.out.println("pc is powered off");
    }

}
