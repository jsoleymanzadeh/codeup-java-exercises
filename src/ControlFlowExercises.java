import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.printf("%d ", i);
//            i++;
//        }
//        int i = 100;
//        do {
//            System.out.printf("%d\n", i);
//            i -= 5;
//        } while (i >= -10);
//        double j = 2;
//        do {
//            System.out.printf("%d\n", (int) j);
//            j *= j;
//        } while (j < 1000000);
//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.printf("%d\n", i);
//        }
//        for (double j = 2; j < 1000000; j *= j) {
//            System.out.printf("%d\n", (int) j);
//        }
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.printf("FizzBuzz\n");
//            } else if (i % 3 == 0) {
//                System.out.printf("Fizz\n");
//            } else if (i % 5 == 0) {
//                System.out.printf("Buzz\n");
//            } else {
//                System.out.printf("%d\n", i);
//            }
//        }
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int userInt = scanner.nextInt();
//        System.out.println("number\t|\tsquared\t|\tcubed\n------\t|\t------\t|\t------\n");
//        for (int i = 1; i <= userInt; i++) {
//            System.out.printf("%d\t\t|\t%d\t\t|\t%d\n", i, i * i, i * i * i);
//        }
//        while (true) {
//            System.out.print("Continue? [y/N] ");
//            String userContinue = scanner.next();
//            if (userContinue.equals("N")) {
//                break;
//            } else if (userContinue.equals("y")) {
//                userInt++;
//                System.out.printf("%d\t\t|\t%d\t\t|\t%d\n", userInt, userInt * userInt, userInt * userInt * userInt);
//            } else {
//                System.out.println("Invalid response.");
//            }
//        }
        while (true) {
            System.out.print("Continue? [y/N] ");
            String userContinue = scanner.next();
            if (userContinue.equals("N")) {
                System.out.println("Exiting...");
                break;
            } else if (!userContinue.equals("y")) {
                System.out.println("Invalid response.");
                continue;
            }
            System.out.print("Enter a grade: ");
            int userGrade = scanner.nextInt();
            String convertedGrade;
            if (userGrade >= 98) {
                convertedGrade = "A+";
            } else if (userGrade >= 93) {
                convertedGrade = "A";
            } else if (userGrade >= 90) {
                convertedGrade = "A-";
            } else if (userGrade >= 88) {
                convertedGrade = "B+";
            } else if (userGrade >= 83) {
                convertedGrade = "B";
            } else if (userGrade >= 80) {
                convertedGrade = "B-";
            } else if (userGrade >= 78) {
                convertedGrade = "C+";
            } else if (userGrade >= 73) {
                convertedGrade = "C";
            } else if (userGrade >= 70) {
                convertedGrade = "C-";
            } else if (userGrade >= 68) {
                convertedGrade = "D+";
            } else if (userGrade >= 63) {
                convertedGrade = "D";
            } else if (userGrade >= 60) {
                convertedGrade = "D-";
            } else {
                convertedGrade = "F";
            }
            System.out.println(convertedGrade);
        }
    }
}