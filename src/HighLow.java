import java.util.InputMismatchException;
import java.util.Scanner;

public class HighLow {
    public static void guessNumber(int target, int limit) {
        Scanner scanner = new Scanner(System.in);
        if (limit == 0) {
            System.out.println("Too many attempts. You lose.");
            return;
        } else if (limit == 1) {
            System.out.println("1 try remaining");
        } else {
            System.out.printf("%d tries remaining.\n", limit);
        }
        System.out.print("Guess a number from 1 to 100: ");
        int userGuess;
        try {
            userGuess = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You must guess a number.");
            guessNumber(target, limit - 1);
            return;
        }
        if (userGuess > 100 || userGuess < 1) {
            System.out.println("Number is from 1 to 100.");
            guessNumber(target, limit - 1);
        } else if (userGuess > target) {
            System.out.println("LOWER");
            guessNumber(target, limit - 1);
        } else if (userGuess < target) {
            System.out.println("HIGHER");
            guessNumber(target, limit - 1);
        } else {
            System.out.println("GOOD GUESS!");
        }
    }

    public static int setDifficulty() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select difficulty: [easy/hard] ");
        String difficulty = scanner.next();
        if (difficulty.equals("easy")) {
            return 10;
        } else if (difficulty.equals("hard")) {
            return 5;
        } else {
            System.out.println("Invalid Input.");
            return setDifficulty();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = (int) (Math.random() * 100 + 1);
        int limit = setDifficulty();
        guessNumber(target, limit);
        while (true) {
            System.out.println("Would you like to play again? [y/N] ");
            String userReplay = scanner.next();
            if (userReplay.equals("N")) {
                System.out.println("Exiting...");
                return;
            } else if (!userReplay.equals("y")) {
                System.out.println("Invalid response.");
                continue;
            }
            limit = setDifficulty();
            target = (int) (Math.random() * 100 + 1);
            guessNumber(target, limit);
        }
    }
}