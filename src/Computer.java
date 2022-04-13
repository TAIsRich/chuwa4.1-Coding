public abstract class Computer {

    private String cpu;
    private String memory;
    private boolean keyboard;
    private boolean screen;

    abstract void input();

    abstract String display();

    public String getCpu(){
        return cpu;
    }

    public void setCpu(String cpu){
        this.cpu = cpu;
    }

    public String getMemory(){
        return memory;
    }

    public void setMemory(String memory){
        this.memory = memory;
    }

    public boolean isKeyboard(){
        return keyboard;
    }

    public void setKeyboard(boolean keyboard){
        this.keyboard = keyboard;
    }

    public boolean isScreen(){
        return screen;
    }

    public void setScreen(boolean screen){
        this.screen = screen;
    }

    @Override
    public String toString(){
        return "Computer{" + "cpu='" + cpu + '\'' + ", memory='" + memory + '\'' + ", keyboard=" + keyboard + ", screen=" + screen + '}';
    }
}

