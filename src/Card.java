public class Card {
    private int faceValue;
    private String suit;
    private String cardName;

    protected Card(int faceValue, String suit, String cardName) {
        this.faceValue = faceValue;
        this.suit = suit;
        this.cardName = cardName;
    }

    public int getValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    public String getSuit() {
        return suit;
    }

    public String getCardName() {
        return cardName;
    }
}