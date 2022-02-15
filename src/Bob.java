import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String userInput = scanner.nextLine();
            if(userInput.endsWith("?")) {
                System.out.println("Sure.");
            } else if(userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if(userInput.equals("")) {
                System.out.println("Fine. Be that way!");
            } else if(userInput.equals("Goodbye.")) {
                System.out.println("Goodbye.");
                break;
            } else {
                System.out.println("Whatever.");
            }
        }
    }
}