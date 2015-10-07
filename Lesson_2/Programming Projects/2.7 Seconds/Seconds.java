/**
 * Takes the user inputted amount of seconds, and reports the hours, minutes, and seconds.
 * 
 * @Andrew Smith 
 * @September 15
 */
import java.util.Scanner;
public class Seconds
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        int hours, minutes, seconds, displaySeconds;
        
        System.out.print ("Enter in the amount of seconds: ");
        seconds = scan.nextInt();
        displaySeconds = seconds; //Allows for the displaying of the original second value in the end
        
        hours = seconds / 3600;
        seconds -= hours * 3600;
        
        minutes = seconds / 60;
        seconds -= minutes * 60;
        
        System.out.print ("In " + displaySeconds + " seconds there are: \n" + hours + " hours. \n" + minutes + " minutes. \n" + seconds + " seconds.");
    }
}