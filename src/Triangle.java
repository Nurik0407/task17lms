public class Triangle extends Shape{

    public Triangle(int a, int b, int c) {
        super(a, b, c);
    }

    @Override
    public double getPerimeter() {
        System.out.print("Triangle:  a + b + c = ");
     return    a+b+c ;
    }
}
