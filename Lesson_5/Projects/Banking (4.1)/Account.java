
/**
 * Represents a bank account with basic services such as deposit and withdraw
 */
import java.text.NumberFormat;

public class Account
{
    private NumberFormat fmt = NumberFormat.getCurrencyInstance();
    
    private final double RATE = 0.035; //interest rate of 3.5%
    
    private int acctNumber; 
    private double balance;
    private String name;
    
    //--------------------------------------------------------------------------------------
    //Sets up initial account by definin its owner, account number, and initial balance.
    //--------------------------------------------------------------------------------------
    public Account (String owner, int account, double initial)
    {
        name = owner;
        acctNumber = account;
        balance = initial;
    }
    
    //--------------------------------------------------------------------------------------
    //Validates the transaction, then deposits the specifired amount from the account. 
    //Returns the new balance
    //--------------------------------------------------------------------------------------
    public double deposit (double amount)
    {
        if (amount < 0) //Deposit value is negative
        {
            System.out.println ();
            System.out.println ("Error: Deposit amount is invalid.");
            System.out.println (acctNumber + " " + fmt.format(amount));
        }else 
            balance += amount;
        return balance;
    }
    
    //--------------------------------------------------------------------------------------
    //Validates the transaction, then withdraws the specifired amount from the account. 
    //Returns the new balance
    //--------------------------------------------------------------------------------------
    public double withdraw (double amount, double fee)
    {
       amount += fee;
        
       if (amount < 0)
        {
            System.out.println ();
            System.out.println ("Error: Withdraw amount is invalid.");
            System.out.println ("Requested: " + fmt.format(amount));
       }else 
            if (amount > balance) //Withdraw value exceeds balance
            {
                System.out.println ();
                System.out.println ("Error: Insufficient Funds");
                System.out.println ("Account: " + acctNumber);
                System.out.println ("Requested: " + fmt.format(amount));
                System.out.println ("Available: " + fmt.format(balance));
            }
            else
                balance -= amount;
       return balance; 
    }
    
    //--------------------------------------------------------------------------------------
    //Validates the transaction, then withdraws the specified amount from the first account 
    //and deposits it into the second account. 
    //--------------------------------------------------------------------------------------
    public void wireMoneyTo (Account secondAccount, double amount)
    {   
       if (amount < 0)
        {
            System.out.println ();
            System.out.println ("Error: Withdraw amount is invalid.");
            System.out.println ("Requested: " + fmt.format(amount));
       }else 
            if (amount > balance) //Withdraw value exceeds balance
            {
                System.out.println ();
                System.out.println ("Error: Insufficient Funds");
                System.out.println ("Account: " + acctNumber);
                System.out.println ("Requested: " + fmt.format(amount));
                System.out.println ("Available: " + fmt.format(balance));
            }
            else{
                balance -= amount; //Withdraws from first account
                secondAccount.deposit(amount); //Deposits in second
            } 
    }
    //--------------------------------------------------------------------------------------
    //Adds interest to the account and returns the new balance.
    //--------------------------------------------------------------------------------------
    public double addInterest ()
    {
        balance += (balance * RATE);
        return balance;
    }
    
    //--------------------------------------------------------------------------------------
    //Returns the current balance of the account.
    //--------------------------------------------------------------------------------------
    public double getBalance ()
    {
        return balance;
    }
    //--------------------------------------------------------------------------------------
    //Returns the account number.
    //--------------------------------------------------------------------------------------
    public double getAccountNumber ()
    {
        return acctNumber;
    }
    
     //--------------------------------------------------------------------------------------
    //Returns a one-line description of the account as a string.
    //--------------------------------------------------------------------------------------
    public String toString()
    {
        return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
    }
}
