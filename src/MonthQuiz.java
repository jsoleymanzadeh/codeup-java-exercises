import util.Input;

import java.util.HashMap;

public class MonthQuiz {
    private static void playQuiz(HashMap<String, Integer> quizAnswers, String[] months, int questionCount) {
        Input userInput = new Input();
        if (questionCount % 3 == 0 && questionCount != 0) {
            if (!userInput.yesNo("Continue playing? [y/N] ")) {
                System.out.println("Exiting...");
                return;
            }
        }
        String randomMonth = months[(int) (Math.random() * 12)];
        System.out.printf("How many days in %s? ", randomMonth);
        try {
            if (userInput.getInt() == quizAnswers.get(randomMonth)) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
        }
        playQuiz(quizAnswers, months, questionCount + 1);
    }

    public static void main(String[] args) {
        HashMap<String, Integer> quizAnswers = new HashMap<>();
        quizAnswers.put("January", 31);
        quizAnswers.put("February", 28);
        quizAnswers.put("March", 31);
        quizAnswers.put("April", 30);
        quizAnswers.put("May", 31);
        quizAnswers.put("June", 30);
        quizAnswers.put("July", 31);
        quizAnswers.put("August", 31);
        quizAnswers.put("September", 30);
        quizAnswers.put("October", 31);
        quizAnswers.put("November", 30);
        quizAnswers.put("December", 31);
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        playQuiz(quizAnswers, months, 0);
    }
}