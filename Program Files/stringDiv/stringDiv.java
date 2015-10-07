/**
 * Takes a string input from the user and [div]ides it into single characters. 
 * The characters are returned to the user.
 * 
 * @Andrew Smith
 * @October 1, 2015
 */
import java.util.Scanner;
public class stringDiv
{
    public static void main (String[] args)
    {
        String input;
        int length = 0;
        char letter;
        Scanner scan = new Scanner (System.in);
        
        System.out.println ("Enter a string to be divided: ");
        System.out.print ("> ");
        input = scan.nextLine();
        
        length = input.length();
        
        for (int index = 0; index < length; index++){
            letter = input.charAt(index);
            System.out.println (letter);
        }
    }
}