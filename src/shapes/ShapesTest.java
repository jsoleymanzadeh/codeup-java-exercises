package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.printf("Perimeter: %f\nArea: %f\n", box1.getPerimeter(), box1.getArea());
//        Rectangle box2 = new Square(5);
//        System.out.printf("Perimeter: %f\nArea: %f", box2.getPerimeter(), box2.getArea());
        Measurable myShape;
        myShape = new Square(5);
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
        System.out.println("myShape.getArea() = " + myShape.getArea());
        myShape = new Rectangle(5, 4);
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
        System.out.println("myShape.getArea() = " + myShape.getArea());
    }
}