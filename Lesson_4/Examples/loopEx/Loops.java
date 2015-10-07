
/**
 * Demonstrates the while loop
 * 
 * @Cockling
 * @Re-make; September 29
 */
public class Loops
{
    public static void main (String[] args)
    {
        int count = 0;
        
        while ( count <= 10)
        {
            System.out.println (" Count = " + count);
            count++;
           
        }
        
        for (count = 0; count <= 10; count ++)
        {
                    System.out.println(" Count = " +  count); 
                    // Will output the value of count.
           
                    // Note that + operator here is for concatenation, not addition.
        }
    }
}