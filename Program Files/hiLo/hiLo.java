/**
 * The computer chooses a random number (1:100), and then the user is instructed to guess until
 * he/she guesses the correct answer.
 * 
 * @Andrew Smith
 * @October 2, 2015
 */
import java.util.Scanner;
import java.util.Random;
public class hiLo
{
    public static void main (String[] args)
    {
       int randNum, userNum = 0;
       final int CEILING = 100;
       boolean game = true, round = true;
       String gameChoice;
       Scanner scan = new Scanner(System.in);
       Random generator = new Random();
       
       while (game==true)
       {
           randNum = generator.nextInt(CEILING) + 1;
           System.out.print ("Guess a random number (1-100) or quit (-1): ");
           userNum = scan.nextInt();
           while (round==true)
          {
               if (userNum == -1){
                    round = false;
                }
               else if (userNum > randNum)
                    System.out.println ("Your guess was HIGH! Guess again.");
               else if (userNum < randNum)
                    System.out.println ("Your guess was LOW! Guess again.");
               else {
                    System.out.println ("Your guess was RIGHT!");
                    round = false;
               }
               if (round == true){
                    System.out.print ("Guess another random number or quit (-1): ");
                    userNum = scan.nextInt();
                }
          }    
           System.out.print ("Play again? (y/n): ");
           gameChoice = scan.next();
           if (gameChoice.equals("n"))
               game = false;
           else
               round = true;
           
           }
        }
    }
