/**
 * Takes the users miles and converts it to Kilometers
 * 
 * @Andrew Smith 
 * @September 15
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Miles
{
   public static void main (String[] args)
   {
       Scanner scan = new Scanner (System.in);
       double miles, kilometers;
       final double CONVERSION_FACTOR = 1.60935;
       DecimalFormat fmt = new DecimalFormat ("0.##");
       
       System.out.print ("Enter in the amount of miles: ");
       miles = scan.nextDouble();
       
       kilometers = miles * CONVERSION_FACTOR;
       System.out.println (miles + " miles is equal to " + fmt.format(kilometers) + " kilometers.");
    }
}