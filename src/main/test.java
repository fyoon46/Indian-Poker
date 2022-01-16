package main;

import game.component.*;

public class test {
    public static void main(String[] args) {
        Deck deck = new Deck();
        for(int i=0; i<20; i++) {
            Card card = deck.drawCard();
            System.out.print(card.face() + " " + card.suit() + "\n");
        }

    }
}
