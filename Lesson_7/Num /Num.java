/**
 * Represents a single integer as an object
 * 
 * @Lewis/Loftus/Cocking
 */

public class Num {
    private int value;
    
    //---------------------------------------------------------------------------------------------------
    // Sets up the new Num object, storing an initial value.
    //---------------------------------------------------------------------------------------------------
    public Num (int update) {
        value = update;
    }
    
    //---------------------------------------------------------------------------------------------------
    // Returns the stored integer value.
    //---------------------------------------------------------------------------------------------------
    public int getValue () {
        return value;
    }
    
    //---------------------------------------------------------------------------------------------------
    // Sets the stored value to the newly specified value.
    //---------------------------------------------------------------------------------------------------
    public void setValue (int update) {
        value = update;
    }
    
    //---------------------------------------------------------------------------------------------------
    // Compares the object obj to this one. 
    //Returns -1 if the value of this is less than the value of obj, 1 if greater, and
    // 0 if they are equal.
    //---------------------------------------------------------------------------------------------------
    public int compareTo (Object obj) {
        int otherValue = ((Num)obj).getValue();
        if (value < otherValue) {
            return -1;
        
        }else if (value > otherValue) {
            return 1;
            
        }else {
            return 0;
        }
    }
    //---------------------------------------------------------------------------------------------------
    // Returns the stored integer value as a string.
    //---------------------------------------------------------------------------------------------------
    public String toString () {
        return value + "";
    }
}