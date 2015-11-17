// TryArray
// Andrew Smith
// 11/11/15    
// This program demonstrates a simple array in Java: how to enter values
// and read  values using for loops.

import java.util.Scanner;    

public class TryArray
    {
        public static void main(String[]args)
            {
            double[]temperature = new double[10];
            Scanner scan = new Scanner(System.in);
       
            System.out.println("You need to enter the high temperatures for the past 10 days");
            for (int index = 0; index < temperature.length; index ++)
            {
                   System.out.print("Enter the high temperature for day " + (index + 1) + " : ");
                   temperature[index] = scan.nextDouble(); // Keyboard input.
             }
        System.out.println("Now we will output the temperatures that were entered, starting with today and going back.");
            for(int index = temperature.length -1; index >= 0; index--)
             {
                  System.out.println(temperature[index]); 
                  // Prints temps in reverse order.
             }
    }
}