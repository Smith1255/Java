/**
 * Program used to find the value of coin totals
 * 
 * @Andrew Smith 
 * @September 18
 */
import java.util.Scanner;
import java.text.NumberFormat;
public class spareChange
{
    public static void main (String [] args)
    {
        int numDollar, numHalf, numQuarter, numDime, numNickel, numPenny;
        double valueTotal;
        
        final double DOLLAR = 1.0;
        final double HALF = 0.5;
        final double QUARTER = 0.25;
        final double DIME = 0.10;
        final double NICKEL = 0.05;
        final double PENNY = 0.01;
       
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print ("Enter the amount of Dollar coins: ");
        numDollar = scan.nextInt();
        
        System.out.print ("Enter the amount of Half-Dollar coins: ");
        numHalf = scan.nextInt();
        
        System.out.print ("Enter the amount of Quarters: ");
        numQuarter = scan.nextInt();
        
        System.out.print ("Enter the amount of Dimes: ");
        numDime = scan.nextInt();
        
        System.out.print ("Enter the amount of Nickels: ");
        numNickel = scan.nextInt();
        
        System.out.print ("Enter the amount of Pennies: ");
        numPenny = scan.nextInt();
        
        valueTotal = (numDollar * DOLLAR) + (numHalf * HALF) + (numQuarter * QUARTER) + 
                        (numDime *DIME) + (numNickel * NICKEL) + (numPenny * PENNY);
                        
        System.out.println ("The total amount of money saved up is: " + money.format(valueTotal));
        System.out.println ("Your share of the money is: " + money.format(valueTotal/2));
        
    }
}