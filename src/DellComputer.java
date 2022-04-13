public class DellComputer extends Computer {


    @Override
    void input(){
        System.out.println("dell input ");
    }

    @Override
    String display(){
        return "dell display:"+ this.toString();
    }

    @Override
    public String toString(){
        return "DellComputer{} " + super.toString();
    }
}

