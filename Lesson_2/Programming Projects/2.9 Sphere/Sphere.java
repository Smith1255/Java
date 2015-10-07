/**
 * Takes the radius of a sphere and prints the volume and surface area
 * 
 * @Andrew Smith 
 * @September 15
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Sphere
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double radius, volume, surfArea;
        DecimalFormat fmt = new DecimalFormat ("0.####");
        System.out.print ("Enter the radius of the sphere: ");
        radius = scan.nextDouble();
       
        volume = (4*Math.PI/3)*Math.pow(radius, 3.0); //Uses volume equation 4/3πr^3
        surfArea =4*Math.PI*Math.pow(radius, 2.0); //Uses surface area equation 4πr^2
        
        System.out.println ("The volume is: " + fmt.format(volume));
        System.out.println ("The surface area is: " + fmt.format(surfArea));
    }
}