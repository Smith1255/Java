/**
 * Demonstrates the use of an aggregate class.
 * 
 * @Andrew Smith (Lewis/Loftus/Cocking ©)
 * ->Andrew Smith: 
 * @October 22, 2015
 */
public class StudentBody {
    //---------------------------------------------------------------------------------------------------
    //Creates some Address and Student objects and prints them.
    //---------------------------------------------------------------------------------------------------
    public static void main (String[] args) {
        Address school = new Address ("800 Lancaster Ave.", "Villanova","PA", 19085);
        
        Address jHome = new Address ("21 Jump Street", "Lynnburg","VA", 24551);
                                        
        Student john = new Student ("John", "Gomes", jHome, school, 100, 60, 88);
                                        
        Address mHome = new Address ("123 Main Street", "Euclid", "OH", 44132);
                                        
        Student marsha = new Student ("Marsha", "Jones", mHome, school, 75, 66, 92);
       
        john.setTestScore(1, 53);
        System.out.println ("New Test Score: " + john.getTestScore(1));
        System.out.println ();
        
        System.out.println (john);
        System.out.println ();
        System.out.println (marsha);
    }
}
