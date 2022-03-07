import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class RockPaperScissors {
    private static void playGame(HashMap<String, Integer> scores) {
        Input userInput = new Input();
        boolean playerWins = false;
        boolean computerWins = false;
        String[] choices = {"rock", "paper", "scissors"};
        System.out.print("1\trock\n2\tpaper\n3\tscissors\nChoice? ");
        try {
            int playerChoice = userInput.getInt();
            System.out.printf("You chose %s\n", choices[playerChoice - 1]);
            int computerChoice = (int) (Math.random() * 3 + 1);
            System.out.printf("Computer chose %s\n", choices[computerChoice - 1]);
            if (playerChoice == 1 && computerChoice == 3) {
                playerWins = true;
            } else if (computerChoice == 1 && playerChoice == 3) {
                computerWins = true;
            } else if (playerChoice > computerChoice) {
                playerWins = true;
            } else if (computerChoice > playerChoice) {
                computerWins = true;
            }
            if (playerWins) {
                System.out.println("You win!");
                scores.put("playerScore", scores.get("playerScore") + 1);
            } else if (computerWins) {
                System.out.println("You lose.");
                scores.put("computerScore", scores.get("computerScore") + 1);
            } else {
                System.out.println("Tie game.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid choice. Point deducted.");
            scores.put("playerScore", scores.get("playerScore") - 1);
        }
        System.out.printf("Score:\n\tYou %d\n\tComputer %d\n\n", scores.get("playerScore"), scores.get("computerScore"));
        if (userInput.yesNo("Play again? [y/N] ")) {
            playGame(scores);
        } else {
            System.out.println("Exiting...");
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("playerScore", 0);
        scores.put("computerScore", 0);
        playGame(scores);
    }
}