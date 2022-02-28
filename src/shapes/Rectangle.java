package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double l, double w) {
        super(l, w);
    }

    public void setLength(double l) {
        this.length = l;
    }

    public void setWidth(double w) {
        this.width = w;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    public double getArea() {
        return this.length * this.width;
    }
}
//public class Rectangle {
//    protected double length;
//    protected double width;
//
//    public Rectangle(double l, double w) {
//        this.length = l;
//        this.width = w;
//    }
//
//    public double getArea() {
//        return this.length * this.width;
//    }
//
//    public double getPerimeter() {
//        return 2 * (this.length + this.width);
//    }
//}