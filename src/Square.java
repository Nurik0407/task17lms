public class Square extends Shape{
    public Square(int a) {
        super(a);
    }

    @Override
    public double getPerimeter() {
        System.out.print("Square:  a + a + a + a = ");
        return a*4;
    }
}
