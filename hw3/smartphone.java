package hw3;

class nobatteryException extends Exception {
    public nobatteryException(String s) {
        super(s);
    }
}

class wrongfingernum extends Exception {
    public wrongfingernum(String s) {
        super(s);
    }
}

abstract public class smartphone implements phone {
    protected String name;
    protected int battery;
    private int displayreso;
    private int refreshrate;
    private String cpu;

    public void checkbattery() throws nobatteryException {
        if (battery <= 5)
            throw new nobatteryException("no battery");
        else
            System.out.print(battery);
    }

    int getdisplayreso() {
        return displayreso;
    }

    abstract void aboutphone();

    void setdisplayreso(int reso) {
        if (reso >= 153600)
            displayreso = reso;
        else
            System.out.print("please input a resolution higher than 480x320");
    }

    void touchthescreen() {
        System.out.print("screen is touched");
    }

    public int getRefreshrate() {
        return refreshrate;
    }

    public void setRefreshrate(int refreshrate) {
        this.refreshrate = refreshrate;
    }

    public String getcpu() {
        return cpu;
    }

    public void setcpu(String cpu) {
        this.cpu = cpu;
    }

}
