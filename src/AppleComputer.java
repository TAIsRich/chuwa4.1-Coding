public class AppleComputer extends Computer {


    @Override
    void input(){
        System.out.println("apple input ");
    }

    @Override
    String display(){
        return "apple display:"+ this.toString();
    }

    @Override
    public String toString(){
        return super.toString();
    }
}

