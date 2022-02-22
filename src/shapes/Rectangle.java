package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }
}