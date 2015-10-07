
/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter
{
    public static void main (String[] args)
    {
        //Prints integer values from 1 to a specific limit.
        final int LIMIT = 5;
        int count = 1;
        
        while (count <= LIMIT)
        {
            System.out.println (count);
            count = count + 1;
        }
        
        System.out.println ("Done");
    }
}