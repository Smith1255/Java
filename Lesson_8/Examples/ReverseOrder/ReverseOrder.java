/**
 * Demonstrates array index proccessing.
 * 
 * @Lewis/Loftus/Cocking
 * @11/11/15
 */
import java.util.Scanner;
public class ReverseOrder
{
    //---------------------------------------------------------------------------------------------------
    //Reads a list of number from the user, stroing them in an array, then prints them in opposite order.
    //---------------------------------------------------------------------------------------------------
    public static void main (String[] args)
    {
        double[] numbers = new double[10];
        Scanner scan = new Scanner (System.in);
        
        System.out.println ("The sixe of the array: " + numbers.length);
        
        for (int index = 0; index < numbers.length; index++) {
            System.out.print ("Enter number " + (index+1) + ": ");
            numbers[index] = scan.nextDouble();
        }
            
        System.out.println ("The numbers in reverse order: ");
        
        for (int index = numbers.length-1; index >= 0; index--) {
            System.out.print (numbers[index] + " ");
        }
            
        System.out.println ();
    }
}
