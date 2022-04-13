public class BootStrap {

    public static void main(String[] args){
        ComputerService service = new ComputerServiceImpl();
        Computer apple = new AppleComputer();
        apple.setCpu("apple cpu");
        apple.setKeyboard(true);
        apple.setMemory("16G");
        apple.setScreen(true);
        try {
            service.display(apple);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            service.input(apple);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Computer dell = new DellComputer();
        dell.setCpu("i7");
        dell.setKeyboard(false);
        dell.setMemory("8G");
        dell.setScreen(false);
        try {
            service.display(dell);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            service.input(dell);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

