import java.util.Random;

/**
 * This class represents a die that you can roll to play board games
 */
public class Die {

    private int numSides;

    /**
     * Constructs a die object (parameterized constructor)
     * @param numSides the number of sides the die has
     */
    public Die(int numSides) {
        this.numSides = numSides;
    }

    /**
     * @return the number of sides on the die
     */
    public int getNumSides() {
        return this.numSides;
    }

    /**
     * Generates a random roll for the die from 1 to
     * the number of sides
     * @return the random die roll
     */
    public int rollDie() {
        // Constructing a random generator object
        Random gen = new Random();
        // Generate a random integer for the die roll
        return gen.nextInt(numSides) + 1;
    }


    @Override
    public String toString() {
        return "Die has " + getNumSides() + " sides.";
    }
}

