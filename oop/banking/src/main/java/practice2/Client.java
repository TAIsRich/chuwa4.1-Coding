package practice2;

public class Client {
    public static void main(String [] args) {

        Computer computer = new Computer.Builder()
                .cpu("intel")
                .screen("Samsung")
                .memory("KM")
                .mainboard("HUA")
                .build();

        System.out.println(computer);
    }

}
