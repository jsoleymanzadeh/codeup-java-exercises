import java.util.Scanner;

public class MethodsExercises {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        if (b == 1) {
            return a;
        }
        return a + multiply(a, b - 1);
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int modulo(int a, int b) {
        return a % b;
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int userInput = scanner.nextInt();
        if (min <= userInput && max >= userInput) {
            return userInput;
        } else {
            System.out.println("Invalid input.");
            return getInteger(min, max);
        }
    }

    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Continue? [y/N] ");
            String userContinue = scanner.next();
            if (userContinue.equals("N")) {
                System.out.println("Exiting...");
                return;
            } else if (!userContinue.equals("y")) {
                System.out.println("Invalid response.");
                continue;
            }
            System.out.print("Enter number from 1 to 25: ");
            int number = scanner.nextInt();
            if (number < 1 || number > 25) {
                System.out.println("Number must be from 1 to 25.");
                continue;
            }
//            long product = 1;
//            for (int i = number; i > 1; i--) {
//                product *= i;
//            }
            long product = recursiveFactorial(number);
            System.out.printf("%d!\t=\t%d\n", number, product);
        }
    }

    public static long recursiveFactorial(int number) {
        if (number == 1) {
            return number;
        }
        return number * recursiveFactorial(number - 1);
    }

    public static void diceRoll() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Continue? [y/N] ");
            String userContinue = scanner.next();
            if (userContinue.equals("N")) {
                System.out.println("Exiting...");
                return;
            } else if (!userContinue.equals("y")) {
                System.out.println("Invalid response.");
                continue;
            }
            System.out.print("Enter amount of sides per die: ");
            int sides = scanner.nextInt();
            System.out.printf("Die 1:\t%d\nDie 2:\t%d\n", rollDie(sides), rollDie(sides));
        }
    }

    public static int rollDie(int sides) {
        return (int) (Math.random() * sides + 1);
    }

    public static void main(String[] args) {
//        int userInput = getInteger(1, 10);
        diceRoll();
    }
}