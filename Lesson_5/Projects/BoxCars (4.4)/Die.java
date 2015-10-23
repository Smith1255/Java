/**
 * Represents the die object and it's respective methods.
 * 
 * @Andrew Smith 
 * @October 22, 2015
 */
import java.util.Random;
public class Die {
    private int numSides, dieValue = 0;
    Random generator = new Random();
    
    //------------------------------------------------------------------------------------------------
    //Sets up a die with 6 faces, when number of sides is not specified
    //------------------------------------------------------------------------------------------------
    public Die() {
        numSides = 6;
        roll();
    }
    
    //------------------------------------------------------------------------------------------------
    //Sets up a die with a specified number of sides
    //------------------------------------------------------------------------------------------------
    public Die(int specifiedSides) {
        if (specifiedSides <= 0)
            numSides = 6;
        else 
            numSides = specifiedSides;
        roll();
    }
    
    //------------------------------------------------------------------------------------------------
    //Rolls the dice by generating a random number in the set of 1-number of sides
    //------------------------------------------------------------------------------------------------
    public int roll() {
        dieValue = generator.nextInt(numSides) + 1;
        return dieValue;
    }
    
    //------------------------------------------------------------------------------------------------
    //Returns the Face Value
    //------------------------------------------------------------------------------------------------
    public int getFaceValue () {
            return dieValue;
    }
    
    //------------------------------------------------------------------------------------------------
    //Returns the number of sides
    //------------------------------------------------------------------------------------------------
    public int getNumSides () {
            return numSides;
    }
    
    public String toString () {
        if (dieValue > 0)
            return ("The value of the die is: " + dieValue);
        else
            return ("Die has not been rolled.");
    }
}