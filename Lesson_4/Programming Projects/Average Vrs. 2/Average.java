/**
 * Demonstrates the use of a while loop when calculating averages.
 * 
 * @Andrew Smith
 * @October 1, 2015
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class Average
{
    public static void main (String[] args)
    {
        int intValue, sum = 0, count = 0; //intValue is the actual user inputed value that is used in calculations
        double average;
        String stringValue; //Used for integer input to allow for more to be entered other than just integers (See while loop sentinel)
        
        Scanner scan = new Scanner (System.in);
        
        DecimalFormat fmt = new DecimalFormat("0.###");
        
        System.out.print ("Enter an integer value (a non-integer to quit): ");
        stringValue = scan.nextLine(); //Gets user input, either an integer or character/string
        
        while (isNumeric(stringValue)) //While the user input is an integer
        {
            intValue = Integer.parseInt(stringValue); //assigns the intValue variable the numeric 'equivalent' value
            sum += intValue; //updates the running su,
            
            System.out.println ("The sum so far is: " + sum);
            
            System.out.print ("Enter another integer value (a non-integer to quit): ");
            stringValue = scan.nextLine(); //User input to be checked next
            
            count++; //running count of how many values that are entered
        }
        
        if (count > 0) //checks to make sure that a value was entered
        {
            average = (double) sum / count;
            System.out.println ("There were " + count + " numbers entered. ");
            System.out.println ("The average was: " + average);
        }else
            System.out.print ("No values entered"); //count = 0
    }
    
    public static boolean isNumeric (String string) //Checks to see if the string is compatible to be converted to an integer
    {
        try { //Tries to see if the follow expression is valid
            Integer.parseInt(string);
            return true;
        }catch (Exception e) //The expression in the try statement was not valid
        {
            return false;
        }
            
    }
}


