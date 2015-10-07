
/**
 * Write a description of class IceCream here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IceCream
{
    enum Flavor {vanilla, chocolate, strawberry, fudgeRipple, coffee, rockyRoad, mintChocolateChip, cookieDough}
    public static void main (String[] args)
    {
        Flavor cone1, cone2, cone3;
        
        cone1 = Flavor.rockyRoad;
        cone2 = Flavor.chocolate;
        
        System.out.println ("cone1: " + cone1);
        System.out.println ("cone2: " + cone2);
        
        cone3 = cone1;
        System.out.println ("cone3: " + cone3);
    }
}
