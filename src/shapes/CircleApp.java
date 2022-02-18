package shapes;

import util.Input;

public class CircleApp {
    private static int circleCount = 0;

    public static void addCircle() {
        circleCount++;
        if (circleCount == 1) {
            System.out.println("1 circle");
        } else {
            System.out.printf("%d circles\n", circleCount);
        }
    }

    public static void main(String[] args) {
        Input scanner = new Input();
        System.out.print("Circle radius: ");
        Circle test = new Circle(scanner.getDouble());
        System.out.printf("Area: %f\nCircumference: %f\n", test.getArea(), test.getCircumference());
        addCircle();
        while (scanner.yesNo("Again? ")) {
            System.out.print("Circle radius: ");
            test = new Circle(scanner.getDouble());
            System.out.printf("Area: %f\nCircumference: %f\n", test.getArea(), test.getCircumference());
            addCircle();
        }
        System.out.println("Exiting...");
    }
}