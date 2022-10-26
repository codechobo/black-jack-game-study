package objects;

public class Card {

    private String pattern;
    private String denomination;

    public Card() {
    }

    public Card(String pattern, String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }

    @Override
    public String toString() {
        return "Card{" +
                "pattern='" + pattern + '\'' +
                ", denomination='" + denomination + '\'' +
                '}';
    }
}
