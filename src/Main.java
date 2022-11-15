public class Main {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Rectangle(2, 3),
                new Triangle(2, 3, 4),
                new Square(2),
                new Trapezoid(2, 3, 4),
                new Rhombus(3)};
        System.out.println("\nA = 2 | B = 3 | C = 4 | \n");
        for (Shape shape : shapes) {
            System.out.println(shape.getPerimeter());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
}