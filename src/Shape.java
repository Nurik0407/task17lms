public abstract class Shape {

    protected int a;
    protected int b;
    protected int c;
    protected int d;

    public Shape(int a, int b, int c,int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Shape(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Shape(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public abstract double getPerimeter();
}
