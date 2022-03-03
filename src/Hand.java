import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> hand;

    public Hand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public int findValue() {
        int total = 0;
        for (Card card : this.hand) {
            if(card.getValue() != 11) {
                total += card.getValue();
            }
        }
        for(Card card : this.hand) {
            if(card.getValue() == 11) {
                if(total + 11 > 21) {
                    card.setFaceValue(1);
                }
                total += card.getValue();
            }
        }
        return total;
    }

    public boolean isBusted() {
        int handValue = findValue();
        return handValue > 21;
    }

    public void hit(Card card) {
        this.hand.add(card);
    }
    public void revealHand(String owner) {
        System.out.printf("%s hand: %d\n", owner, findValue());
        for(Card card : this.hand) {
            System.out.printf("\t%s of %s\n", card.getCardName(), card.getSuit());
        }
    }
}