/**
 * Represents the PairOfDice object. 
 * 
 * Creates two separate Die objects, and offers methods that 
 * can effect both dice at one, as opposed to manually calling methods on each die. 
 * 
 * @Andrew Smith
 * @October 22, 2015
 */
public class PairOfDice
{
    private int[] faceValues = new int[2];
    private Die dieOne, dieTwo;
    
    //------------------------------------------------------------------------------------------------
    //Sets up two die with default 6 sides
    //------------------------------------------------------------------------------------------------
    public PairOfDice () {
       dieOne = new Die (); 
       dieTwo = new Die (); 
    }
    
    //------------------------------------------------------------------------------------------------
    //Sets up two die with specified number of sides for BOTH die.
    //------------------------------------------------------------------------------------------------
    public PairOfDice (int numFaces) {
       Die dieOne = new Die (numFaces); 
       Die dieTwo = new Die (numFaces); 
    }
    
    //------------------------------------------------------------------------------------------------
    //Sets up two die with number of sides specified for each die
    //------------------------------------------------------------------------------------------------
    public PairOfDice (int numFacesOne, int numFacesTwo) {
       Die dieOne = new Die (numFacesOne); 
       Die dieTwo = new Die (numFacesTwo); 
    }
    
    //------------------------------------------------------------------------------------------------
    //Rolls both dice using the Die method roll()
    //------------------------------------------------------------------------------------------------
    public void roll () {
        dieOne.roll();
        dieTwo.roll();
        
        
    }
    
    //------------------------------------------------------------------------------------------------
    //Returns the values of both die, in the form of an array
    //------------------------------------------------------------------------------------------------
    public int[] getFaceValueArray (){
        faceValues[0] = dieOne.getFaceValue();
        faceValues[1] = dieTwo.getFaceValue(); 
        
        return faceValues;
    }
    
    //------------------------------------------------------------------------------------------------
    //Returns the specified die value, as represented by 1 for the first die and 2 for the second
    //------------------------------------------------------------------------------------------------
    public int getSingleValue (int die){
        if (die == 1)
            return dieOne.getFaceValue();
        else if (die == 2)
            return dieTwo.getFaceValue(); 
        else
            return -1;
    }
    
    //------------------------------------------------------------------------------------------------
    //Checks to see if there is equality between the two die values
    //------------------------------------------------------------------------------------------------
    public boolean areEqual () {
        if (dieOne.getFaceValue() == dieTwo.getFaceValue())
            return true;
        else 
            return false;
    }
    
    public String toString () {
        return dieOne + "\n" + dieTwo + "\n";
    }
}