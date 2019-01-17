/**
 * The Transaction class will perform a Bank
 * Transaction of depositing or withdrawing money.
 * 
 * @Riya
 * @version: (01/17/18)
 */
public class Transaction
{
    //fields
    private int accountNum;
    private String transactionType;
    private double amount;
    
    //constructor
    public Transaction(int act, String dw, double amt)
    {
        accountNum = act; 
        transactionType = dw; 
        amount=amt; 
    }

    //methods
    public int getAccountNumber () 
    { 
         return accountNum;
    }
    public String getTransactionType () 
    { 
         return transactionType; 
    }
    public double getTransactionAmount () 
    { 
         return amount; 
    }
}