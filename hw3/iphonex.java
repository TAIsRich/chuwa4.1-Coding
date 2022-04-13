package hw3;

public class iphonex extends smartphone {
    private String name = "iPhone X";
    private int battery;

    iphonex() throws Exception {
        battery = 100;
        super.setdisplayreso(2740500);
        super.setRefreshrate(120);
        super.setcpu("Apple A11 Bionic");
    }

    @Override
    public void chargephone() {

        if (battery == 100)
            System.out.print("your phone is fully charged");
        else if (battery == 75) {
            battery = 100;
        } else {
            battery = 75;
            System.out.print("enjoy the marvelous apple 5w charging!");
        }
    }

    @Override
    public void textmessage() {
        minusBattery();
        System.out.print("texting in imessages");
    }

    @Override
    void aboutphone() {
        minusBattery();
        System.out.print(
                "CPU: " + getcpu() + "\nDisplay Pixels: " + getdisplayreso() + "\nRefreshRate: " + getRefreshrate()
                        + " Hz\n\n");

    }

    @Override
    void touchthescreen() {
        minusBattery();
        System.out.print("you are touching Super OLED Display, with the brand new " + super.getRefreshrate()
                + "HZ refreshrate, it feel so responsive every interaction feel new again! \n\n");
    }

    void touchthescreen(int fingers) throws Exception {
        minusBattery();
        if (fingers == 1) {
            touchthescreen();
        } else if (fingers == 2) {
            System.out.println("zooming in\n\n");
        } else if (fingers >= 3) {
            System.out.println("trigger multi-tasking interface\n\n");
        } else {
            throw new wrongfingernum("the number of fingers cant be 0 or below\n\n");
        }

    }

    public int getBattery() {
        return battery;
    }

    public void minusBattery() {
        this.battery -= 24;
    }

    public void call() {
        minusBattery();
        System.out.print("calling with the brand new " + name + "\n\n");
    }
}

class Person {
    public static void main(String[] args) {

        try {
            iphonex a = new iphonex();

            a.call();
            a.call();
            a.aboutphone();
            a.touchthescreen();
            a.touchthescreen(2);
            a.checkbattery();

        } catch (nobatteryException e) {
            System.out.print(e);
        } catch (ArithmeticException e) {
            System.out.println("um dont divde the number by 0 please");
        } catch (Exception e) {
            System.out.println("ops you must have mishandled the program, it's not my fault!");
        }

    }
}