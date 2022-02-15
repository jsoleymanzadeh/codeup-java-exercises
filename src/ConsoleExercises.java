import java.util.Scanner;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %f", pi);
//        System.out.format("The value of pi is approximately %f", pi);
        Scanner scanner = new Scanner(System.in);
//        System.out.printf("Enter an int: ");
//        int userInput = scanner.nextInt();
//        System.out.printf("Enter 3 words: ");
//        String word1 = scanner.next();
//        String word2 = scanner.next();
//        String word3 = scanner.next();
//        System.out.printf("%s\n%s\n%s", word1, word2, word3);
//        System.out.printf("Enter a sentence: ");
//        String sentence = scanner.nextLine();
//        System.out.printf(sentence);
        scanner.useDelimiter("\n");
        System.out.print("Enter length: ");
        int length = scanner.nextInt();
        System.out.print("Enter width: ");
        int width = scanner.nextInt();
        System.out.print("Enter height: ");
        int height = scanner.nextInt();
        System.out.printf("area: %d\nperimeter: %d\nvolume: %d", length * width, 2 * (length + width), length * width * height);
    }
}