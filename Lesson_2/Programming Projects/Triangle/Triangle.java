//***************************************************************************************
//Triangle.java
//Andrew Smith
//September 4, 2015
//
//This program takes 3 sides of a triangle and computes the area (using Heron's formula)
//***************************************************************************************
import java.util.Scanner;
import java.text.DecimalFormat;
public class Triangle 
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        double sideA, sideB, sideC, varS, area;
        //varS stands for S-variable, which represents 1/2 the perimeter of the given triangle
        
        System.out.print ("Enter a first side length: ");
        sideA = scan.nextDouble();
        
        System.out.print ("Enter a second side length: ");
        sideB = scan.nextDouble();
        
        System.out.print ("Enter a third side length: ");
        sideC = scan.nextDouble();
        
        varS = (sideA + sideB + sideC) / 2;//perimeter divided by 2
        area = Math.sqrt(varS * (varS - sideA) * (varS - sideB) * (varS - sideC));
        DecimalFormat fmt = new DecimalFormat("0.###");
        
        System.out.println ("The area of the given triangle is: " + fmt.format(area));
    }
}
