import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<>();
        for (int i = 2; i <= 11; i++) {
            if(i <= 10) {
                deck.add(new Card(i, "hearts", String.valueOf(i)));
                deck.add(new Card(i, "diamonds", String.valueOf(i)));
                deck.add(new Card(i, "clubs", String.valueOf(i)));
                deck.add(new Card(i, "spades", String.valueOf(i)));
            }
            if (i == 10) {
                deck.add(new Card(i, "hearts", "Jack"));
                deck.add(new Card(i, "diamonds", "Jack"));
                deck.add(new Card(i, "clubs", "Jack"));
                deck.add(new Card(i, "spades", "Jack"));
                deck.add(new Card(i, "hearts", "Queen"));
                deck.add(new Card(i, "diamonds", "Queen"));
                deck.add(new Card(i, "clubs", "Queen"));
                deck.add(new Card(i, "spades", "Queen"));
                deck.add(new Card(i, "hearts", "King"));
                deck.add(new Card(i, "diamonds", "King"));
                deck.add(new Card(i, "clubs", "King"));
                deck.add(new Card(i, "spades", "King"));

            }
            if(i == 11) {
                deck.add(new Card(i, "hearts", "Ace"));
                deck.add(new Card(i, "diamonds", "Ace"));
                deck.add(new Card(i, "clubs", "Ace"));
                deck.add(new Card(i, "spades", "Ace"));
            }
        }
    }

    public Card draw() {
        Card drawnCard = deck.get(0);
        deck.remove(drawnCard);
        return drawnCard;
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }
}