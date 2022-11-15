public class Rectangle extends Shape{
    public Rectangle(int a, int b) {
        super(a, b);
    }

    @Override
    public double getPerimeter() {
        System.out.print("Rectangle:  a + a + b + b = ");
        return Math.scalb((a+b),1);
    }
}
