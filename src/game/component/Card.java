package game.component;

public record Card(int face, String suit) {

    public String toString() {
        return face + " " + suit;
    }
}
