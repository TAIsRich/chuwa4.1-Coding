package bank;

public class OverdraftException extends Exception{
    static final long serialVersionUID = -33875169229948L;
    private double deficit;

    public double getDeficit() {
        return deficit;
    }

    public OverdraftException(String msg, double deficit) {
        super(msg);
        this.deficit = deficit;
    }

}
