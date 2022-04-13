public class Circle extends Shape{
    private int radius;
    private static double x = 3.14;

    @Override
    public int printArea() {
        return (int)(radius * x);
    }
}
