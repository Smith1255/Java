/**
 * SDP.java
 * 
 * Scans for 2 numbers and prints the Sum, Difference, and Product
 * 
 * @Andrew Smith
 * @September 15
 */
import java.util.Scanner;
public class SDP 
{
    public static void main (String[] args)
    {
        double num1, num2;
        Scanner scan = new Scanner (System.in);
        
        System.out.print ("Enter a first number: ");
        num1 = scan.nextDouble();
        
        System.out.print ("Enter a second number: ");
        num2 = scan.nextDouble();
        
        System.out.println ("The sum of these numbers is: " + (num1 + num2));
        System.out.println ("The difference of these numbers is: " + (num1 - num2));
        System.out.println ("The product of these numbers is: " + (num1 * num2));
    }
}