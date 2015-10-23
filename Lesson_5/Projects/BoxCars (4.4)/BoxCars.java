/**
 * Calculates the total number of 'Box Cars', or double 6's, from a set of rolls (1000 in this case).
 * 
 * @Andrew Smith
 * @October 22, 2015
 */
import java.text.NumberFormat;
public class BoxCars
{
    //------------------------------------------------------------------------------------------------------------
    //Creates a PairOfDice object, rolls 1000 times while simultaneously checking for pairs of 6
    //------------------------------------------------------------------------------------------------------------
    public static void main (String[] args)
    {
        PairOfDice diePair = new PairOfDice(); //Creates a PairOfDice object, which creates two Die objects
        int numBoxCars = 0; //Pairs of 6
        final int MAX_ROLLS = 1000;
        NumberFormat fmt = NumberFormat.getPercentInstance();
        
        for (int i = 0; i <= MAX_ROLLS; i++) { //Rolls (and checks) 1000 times
            diePair.roll();
            
            //If the pair is equal, and the first die is equal to 6; If the first die is 6, the second must be 6
            if (diePair.areEqual() && diePair.getSingleValue(1) == 6) {
                numBoxCars++;
            }
        }
        System.out.println ("Out of 1000 total rolls, there were " + numBoxCars + " BoxCars.");
        System.out.println ("That makes the chance of a BoxCar about " + fmt.format((double) numBoxCars / MAX_ROLLS));
    }
}