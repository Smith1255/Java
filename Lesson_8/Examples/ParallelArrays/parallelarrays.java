// Andrew Smith
// 11/11/15
// Try parallel arrays
// Demonstrates how parallel arrays work; uses same index number in different arrays to correspond.

import java.util.Scanner;                  
public class parallelarrays
{
    public static void main (String[]args)
    {
        String[] studentnames = new String[8];
        int[] grades = new int[8];
        Scanner scan = new Scanner(System.in);
        
      
        for ( int count = 0; count < 8; count++) { // Enter the student names.
             System.out.print("Enter your name (" + (8-count) + "): ");
             studentnames[count] = scan.nextLine();
        }
        
      
        for ( int count = 0; count <8; count++) { // Enter student grades.
            System.out.print ("Enter grades (" + (8-count) + "): ");
            grades[count] = scan.nextInt();
        }  
        
        // Output parallel arrays of the student names with their grades.
        for ( int count = 0; count <8; count++) {
             System.out.println( studentnames[count] + " has a grade of " 
             +  grades[count]);
        }
   
    }
}