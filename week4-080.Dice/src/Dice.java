import java.util.Random;

public class Dice {
    private Random random;
    private int numberOfSides;

    public Dice(int numberOfSides) {
        // Initialize here the number of sides
        this.numberOfSides = numberOfSides + 1;
        random = new Random();

    }

    public int roll() {
        // create here a random number belongig to range 1-numberOfSided
        return this.random.nextInt(this.numberOfSides - 1) + 1;
    }
}
