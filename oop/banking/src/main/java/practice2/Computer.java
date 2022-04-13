package practice2;

import java.util.Locale.Builder;

/**
 *
 * @Description: Computer
 */
public class Computer {
    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;


    private Computer(Builder builder){
        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.memory = builder.memory;
        this.mainboard = builder.mainboard;
    }

    public static Computer(Builder builder) {
        String cpu;
        String screen;
        String memory;
        String mainboard;
    }

    public Computer cpu(String cpu){
        this.cpu = cpu;
        return this;
    }

    public Builder screen(String screen) {
        this.screen = screen;
        return this;
    }

    public Builder memory(String memory){
        this.memory = memory;
        return this;
    }

    public Builder mainboard(String mainboard) {
        this.mainboard = mainboard;
        return this;
    }

    public Computer builder(){
        return new Computer(builder: this);
    }
}
