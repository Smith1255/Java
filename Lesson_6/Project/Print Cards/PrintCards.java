/**
 * Uses the Card class to print out 20 random cards.
 * 
 * @Andrew Smith
 * @October 29, 2015
 **/
public class PrintCards {
    public static void main (String[] args) {
        Card userCard = new Card();
        final int NUMCARDS = 20;
        
        for (int i = 0; i < NUMCARDS; i++) {
            System.out.println (userCard); //Prints Value with Suit
            userCard.newCard(); //Creates a new card with value 1-13, and one of the 4 suits
        }
    }
}