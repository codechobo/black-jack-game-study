package objects;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CardDeck {

    private List<Card> cards;
    private static final String[] PATTERNS = {"spade", "heart", "diamond", "club"};
    private static final int CARD_COUNT = 13;

    public CardDeck() {
        this.cards = this.generateCards();
    }

    private List<Card> generateCards() {
        List<Card> cards = new LinkedList<>();
        for (String pattern : PATTERNS) {
            for (int cardNumber = 1; cardNumber <= CARD_COUNT; cardNumber++) {
                String denomination = numberToDenomination(cardNumber);
                Card card = new Card(pattern, denomination);
                cards.add(card);
            }
        }
        return cards;
    }

    private String numberToDenomination(int number) {
        if (number == 1) {
            return "A";
        } else if (number == 11) {
            return  "J";
        } else if (number == 12) {
            return  "Q";
        } else if (number == 13) {
            return  "K";
        }
        return String.valueOf(number);
    }

    public Card draw() {
        Card selectedCard = getRandomCard();
        this.cards.remove(selectedCard);
        return selectedCard;
    }

    private Card getRandomCard() {
        int currentCardCount = this.cards.size();
        int select = (int) (Math.random() * currentCardCount);
        return this.cards.get(select);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : cards) {
            sb.append(card.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
