/**
 * Sums all of the even integers between 2 and the input value.
 * 
 * @Andrew Smith
 * @October 1, 2015
 */
import java.util.Scanner;
public class evenInts
{
    public static void main (String[] args)
    {
       int inputVal, sum = 0, count = 0;
       Scanner scan = new Scanner(System.in);
       
       System.out.print ("Enter the integer value: ");
       inputVal = scan.nextInt();
       
       while (inputVal >= 2) {
           
           if (inputVal % 2 == 0){
                sum += inputVal;
                inputVal -= 2;
                count++;
            }
           else
                inputVal--;
        }
      
       if (count > 0)
            System.out.print ("The sum of all the even integers from 2 to your integer is: " + sum);
       else
            System.out.print ("The value was less than 2.");
    }
}