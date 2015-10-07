/**
 * Determines whether or not the given year is a leap year
 * 
 * @Andrew Smith
 * @October 1, 2015
 */
import java.util.Scanner;
public class leapYear
{
    public static void main (String[] args)
    {
        int year;
        boolean leap;
        Scanner scan = new Scanner(System.in);
        
        System.out.print ("Enter a year to be examined: ");
        year = scan.nextInt();
        
        if (year % 4 == 0)
            if (year % 100 == 0)
                if (year % 400 == 0)
                    leap = true; //The year is divisible by 4, 100, and 400
                
                else
                    leap = false; //The year is divisible by 4, 100 and not 400
            else
                leap = true; //The year is divisible by 4, and not 100
        else
            leap = false; //The year is not divisible by 4
           
        if (leap && year >= 1582)
            System.out.println ("The year is a leap year.");
        else
            System.out.println ("The year is NOT a leap year.");      
    }
}

