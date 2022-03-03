import util.Input;

import java.util.ArrayList;

public class BlackJack {
    public static boolean checkHand(Hand ownerHand) {
        if (ownerHand.findValue() == 21) {
            return false;
        }
        return !ownerHand.isBusted();
    }

    public static void playGame() {
        Input playerInput = new Input();
        Deck gameDeck = new Deck();
        gameDeck.shuffle();
        System.out.println("Dealing Cards...");
        ArrayList<Card> playerStarting = new ArrayList<>();
        ArrayList<Card> dealerStarting = new ArrayList<>();
        playerStarting.add(gameDeck.draw());
        dealerStarting.add(gameDeck.draw());
        System.out.printf("Dealer's face-up card: %s of %s\n", dealerStarting.get(0).getCardName(), dealerStarting.get(0).getSuit());
        playerStarting.add(gameDeck.draw());
        dealerStarting.add(gameDeck.draw());
        Hand playerHand = new Hand(playerStarting);
        Hand dealerHand = new Hand(dealerStarting);
        playerHand.revealHand("Your");
        boolean playerCanHit = checkHand(playerHand);
        boolean opponentCanHit = checkHand(dealerHand);
        while (playerCanHit || opponentCanHit) {
            if (playerCanHit) {
                if (playerInput.yesNo("Hit? [y/N] ")) {
                    playerHand.hit(gameDeck.draw());
                    playerHand.revealHand("Your");
                    playerCanHit = checkHand(playerHand);
                    if (playerHand.findValue() == 21) {
                        System.out.println("You have blackjack");
                    } else if (playerHand.isBusted()) {
                        System.out.println("You have busted.");
                        break;
                    }
                } else {
                    playerCanHit = false;
                }
            }
            if (playerHand.isBusted()) {
                opponentCanHit = false;
            } else if (dealerHand.findValue() < 17) {
                dealerHand.hit(gameDeck.draw());
                opponentCanHit = checkHand(dealerHand);
                if (dealerHand.isBusted()) {
                    break;
                }
            } else {
                opponentCanHit = false;
            }
        }
        dealerHand.revealHand("Dealer's");
        if (dealerHand.findValue() == 21) {
            System.out.println("Dealer has blackjack");
        } else if (dealerHand.isBusted()) {
            System.out.println("Dealer busted.");
        }
        if((playerHand.isBusted() && dealerHand.isBusted()) || playerHand.findValue() == dealerHand.findValue()) {
            System.out.println("Tie game.");
        }
        if ((!playerHand.isBusted() && !dealerHand.isBusted() && playerHand.findValue() > dealerHand.findValue()) || dealerHand.isBusted()) {
            System.out.println("You win!");
        } else if (playerHand.findValue() == dealerHand.findValue()) {
            System.out.println("Tie game.");
        } else {
            System.out.println("You lose!");
        }
        if (playerInput.yesNo("Play again? [y/N] ")) {
            playGame();
        } else {
            System.out.println("Exiting...");
        }
    }

    public static void main(String[] args) {
        playGame();
    }
}