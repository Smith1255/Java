/**
 * Takes integers as input and then prints out the individual integer totals for the set inputted.
 * 
 * @Andrew Smith
 * @November 14
 */
import java.util.Scanner;

public class IntegerCounter {
    public static void main (String[] args) {
        int input = 0;
        final int RANGE = 50;
        int[] integers = new int[RANGE+1];
        Scanner scan = new Scanner (System.in);
        
        System.out.print ("Enter an integer value (0-50), or (-1) to quit: ");
        input = scan.nextInt();
        
        while (input != -1) {
            integers[input] += 1;
             
            System.out.print ("Enter an integer value (0-50), or (-1) to quit: ");
            input = scan.nextInt();
        }
        
        for (int index = 0; index < RANGE+1; index++) {
            System.out.println (index + ": " + integers[index]);
        }
    }
}

