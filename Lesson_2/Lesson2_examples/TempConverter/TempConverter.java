/**
 * Converts from celsius to fahrenheitTemp
 * 
 * @Andrew Smith
 * @September 10
 */
public class TempConverter
{
    public static void main (String[] args)
    {
        final int BASE = 32;
        final double CONVERSION_FACTOR = 9.0 / 5.0;
        
        int celsiusTemp = 24; //Value that is converted
        double fahrenheitTemp;
        
        fahrenheitTemp = celsiusTemp * CONVERSION_FACTOR + BASE;
        
        System.out.println ("Celsius Temperature: " + celsiusTemp);
        System.out.println ("Fahrenheit Equivalent: " + fahrenheitTemp);
    }
}
