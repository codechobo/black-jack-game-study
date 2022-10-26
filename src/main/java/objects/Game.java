package objects;

public class Game {

    public void play() {
        System.out.println("=====Black Jack Game Start!!!=====");

        Rule rule = new Rule();
        Dealer dealer = new Dealer();
        Gamer gamer = new Gamer();
        CardDeck cardDeck = new CardDeck();
        System.out.println(cardDeck);

        System.out.println("=======");

        Card card = cardDeck.draw();
        System.out.println("Pick Card Info : " + card);
    }
}
