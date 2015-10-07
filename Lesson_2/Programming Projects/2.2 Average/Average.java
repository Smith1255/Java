
/**
 * Average.java
 * 
 * Scans for 3 numbers and prints the average
 * 
 * @Andrew Smith
 * @September 15
 */
import java.util.Scanner;
public class Average 
{
    public static void main (String[] args)
    {
        double num1, num2, num3, avg;
        Scanner scan = new Scanner (System.in);
        
        System.out.print ("Enter a first number: ");
        num1 = scan.nextDouble();
        
        System.out.print ("Enter a second number: ");
        num2 = scan.nextDouble();
        
        System.out.print ("Enter a third number: ");
        num3 = scan.nextDouble();
        
        avg = (num1 + num2 + num3) / 3;
        System.out.println ("The average of these 3 numbers is: " + avg);
    }
}