public class Rhombus extends Shape {
    public Rhombus(int a) {
        super(a);
    }

    @Override
    public double getPerimeter() {
        System.out.print("Rhombus:  b + b + b + b = ");
        return a * 4;
    }
}
