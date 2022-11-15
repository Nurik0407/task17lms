public class Trapezoid extends Shape {
    public Trapezoid(int a, int b, int c) {
        super(a, b, c);
    }

    @Override
    public double getPerimeter() {
        System.out.print("Trapezoid:  a + b + c + b = ");
        return a+b+c+b;
    }
}
