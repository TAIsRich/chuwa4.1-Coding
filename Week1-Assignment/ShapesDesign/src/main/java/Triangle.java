public class Triangle extends Shape{
    private int height;
    private int bottom;

    @Override
    public int printArea(){
        return height * bottom /2;
    }
}
