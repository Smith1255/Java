
/**
 * Write a description of class CircleStats here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class CircleStats
{
    // instance variables - replace the example below with your own
    public static void main (String[] args)
    {
        int radius;
        double area, circumference;
        Scanner scan = new Scanner(System.in);
        
        System.out.print ("Enter the circle's radius: ");
        radius = scan.nextInt();
        
        area = Math.PI * Math.pow(radius, 2);
        circumference = 2 * Math.PI * radius;
        
        DecimalFormat fmt = new DecimalFormat ("0.###");
        
        System.out.println ("The circle's area: " + fmt.format(area));
        System.out.println ("The circle's circumference: " + fmt.format(circumference));
    }
}