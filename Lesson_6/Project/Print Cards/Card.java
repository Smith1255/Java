/**
 * Creates a card with a value from 1-13, along with a face value 1-4 (Heart, Diamond, etc)
 * 
 */
import java.util.Random;
public class Card {
    private int faceValue, suitValue; //These integers represent the string values of the cards
    Random randomGen = new Random();
    
    //------------------------------------------------------------------------------------------------
    //Sets up card object by calling the newCard method
    //------------------------------------------------------------------------------------------------
    public Card () {
        newCard();
    }
    
    //------------------------------------------------------------------------------------------------
    //Chooses a new card by picking a random number 1-13, and another random number 
    //1-4 (Heart, Diamond, Club, Spade). These two values represent the 'string' equivalents.
    //------------------------------------------------------------------------------------------------
    public int[] newCard () {
        int[] card = new int[2]; //Temporarily holds the two card values for return
        faceValue = randomGen.nextInt(13) + 1; //Face value 1-13
        suitValue = randomGen.nextInt(4) + 1; //Suit value 1-4
        
        card[0] = faceValue;
        card[1] = suitValue;
        return card; //returns an array with the two card values
    }
    
    //------------------------------------------------------------------------------------------------
    //Returns the INTEGER face value
    //------------------------------------------------------------------------------------------------
    public int getFaceValue () { 
        return faceValue;
    }
    
    //------------------------------------------------------------------------------------------------
    //Returns the INTEGER suit value
    //------------------------------------------------------------------------------------------------ 
    public int getSuitValue () { 
        return suitValue;
    }
    
    //------------------------------------------------------------------------------------------------
    //Finds the STRING equivalent of the integer face value
    //------------------------------------------------------------------------------------------------
    public String getFace () {
        switch (faceValue) {
            case (1):
                return "Ace";
            case (2):
                return "Two";
            case (3):
                return "Three";
            case (4):
                return "Four";
            case (5):
                return "Five";
            case (6):
                return "Six";
            case (7):
                return "Seven";
            case (8):
                return "Eight";
            case (9):
                return "Nine";
            case (10):
                return "Ten";
            case (11):
                return "Jack";
            case (12):
                return "Queen";
            case (13):
                return "King";
            default:
                return null;
            
        }
    }
    
    //------------------------------------------------------------------------------------------------
    //Finds the STRING equivalent of the integer suit value
    //------------------------------------------------------------------------------------------------
    public String getSuit () {
        switch (suitValue) {
            case (1):
                return "Heart";
            case (2):
                return "Diamond";
            case (3):
                return "Club";
            case (4):
                return "Spade";
            default:
                return null;
            
        }
    }
    
    //------------------------------------------------------------------------------------------------
    ////Prints the two card values in string form
    //------------------------------------------------------------------------------------------------
    public String toString () { //Prints the two card values in string form
        return this.getFace() + " of " + this.getSuit() + "s.";
    }
}