package game.component;

import java.util.Vector;
import java.util.Collections;

public class Deck {
    private final Vector<Card> deck;
    private static final int[] FACE = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private static final String[] SUIT = {"Spade", "Diamond"};

    public Deck() {
        deck = new Vector<>();
        for(int i=0; i<10; i++) {
            for(int j=0; j<2; j++) {
                Card card = new Card(FACE[i], SUIT[j]);
                deck.add(card);
            }
        }
        Collections.shuffle(deck);
    }

    public Card drawCard() {
        Card card = deck.get(deck.size()-1);
        deck.remove(deck.size()-1);
        return card;
    }
}
