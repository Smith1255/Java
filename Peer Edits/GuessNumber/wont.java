import java.util.Random;
import java.util.Scanner;

public class wont
{
public static void main (String[] args)
{
Random generator = new Random ();
Scanner scan = new Scanner (System.in);

int target, guess, count = 0;
String restart = new String ("y");

while (restart.equals("y"))
{
System.out.println ("Guess the number between 1 and 100 (0 to quit): ");
guess = scan.nextInt();
count = count + 1;
target = generator.nextInt(100) + 1;

while (guess > 0 && guess!= target)
{
if (guess > target)
System.out.println ("Too High!");
else
System.out.println ("Too low!");
System.out.println ("Guess the number between 1 and 100 (0 to quit): ");
guess = scan.nextInt();
count = count + 1;
}
if (guess == target && guess > 0)
{
System.out.println ("Correct! You had " + count + " guesses!");
System.out.print ("Do you want to play again (y/n)? ");
restart = scan.next();
}
}
}
}

