package shapes;

class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side);
    }

    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    public void setWidth(double side) {
        this.length = side;
        this.width = side;
    }

    public double getPerimeter() {
        return this.length * 4;
    }

    public double getArea() {
        return this.length * this.length;
    }
}
//public class Square extends Rectangle {
//    private double side;
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    public double getArea() {
//        return Math.pow(side, 2);
//    }
//
//    public double getPerimeter() {
//        return 4 * side;
//    }
//}