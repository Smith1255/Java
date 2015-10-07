
/*********************************************************************************************************************
 * This program computes the MPG of a car using user-inputted data including: 
 * Odometer information, Gas used, and Price of gas
 *********************************************************************************************************************
 * @Andrew Smith 
 * @September 19, 2015
 */
import java.util.Scanner; //Used to read user input
import java.text.NumberFormat; //Used for the price of gas output
import java.text.DecimalFormat;
public class MPG
{
    public static void main (String[] args)
    {
      int odomStart = 0, odomEnd = 0, totalMiles; //Sets both 'odom' variables to zero to enter while loop
      double mpg, gasUsed = 0, gasPrice = 0, moneySpent; //Sets both gas variables to zero to enter while loop
      
      Scanner scan = new Scanner (System.in);
      
      NumberFormat money = NumberFormat.getCurrencyInstance(); //Creates money format used for gas price
      DecimalFormat twoDec = new DecimalFormat("0.##"); //Creates 2 decimal place format
      
      while (gasUsed <= 0 || gasPrice < 0) 
      //Loop to check for invalid data input; If either value is below zero, or gasUsed is zero
      {
          System.out.print ("Enter the total gallons of gas used, followed by price (ex. 17 2.59): "); 
          //Asks for the two gas variables
          gasUsed = scan.nextDouble();
          gasPrice = scan.nextDouble();
          
          if (gasUsed <= 0 || gasPrice < 0) //If user enters invalid data
                System.out.println ("The values entered are not valid.");
          
          System.out.println ("");
        }
      
      while (odomStart >= odomEnd || odomStart < 0) 
      //Loop to check for invalid data input; starting odometer is less than zero or is less than the end reading
      {     
            System.out.print ("Enter the starting odometer and ending odometer miles (ex. 123 124): "); 
            //Asks for the odometer readings
            odomStart = scan.nextInt();
            odomEnd = scan.nextInt();
            
            if (odomStart >= odomEnd || odomStart < 0) //If user enters invalid data
                System.out.println ("The values entered are not valid.");  
            System.out.println ("");
      }
            
      totalMiles = odomEnd - odomStart; //Computes the total miles traveled using the difference in values
      mpg = (double) totalMiles / gasUsed ; //Computes the average mileage per gallon used
      moneySpent = gasPrice * gasUsed;
      
      System.out.println ("*****************************************************************************");
      System.out.println ("You have spent " + money.format(moneySpent) + " to travel " + totalMiles + " miles."); 
      System.out.println ("You traveled at " + twoDec.format(mpg) + " miles per gallon.");
      System.out.println ("*****************************************************************************");
      
    }
}