public class Rectangle extends Shape{
    private int height;
    private int width;

    @Override
    public int printArea(){
        return height * width;
    }
}
