public class ComputingSystem {
    private static String username;

    public static ComputingSystem computeByComputer = new ComputingSystem();

    public ComputingSystem() {
    }


    public static void main(String[] args) throws Exception{
        try{
            Computer pc = new Laptop(username);
            pc.start();
            Laptop lp= new Laptop(username);
            lp.playVideo();
            lp.playVideo(lp.isAuthorized);

        }catch(Exception e){
            System.out.println("exception caught");
        }
    }
}
