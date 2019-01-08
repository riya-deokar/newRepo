/**
 * The Transaction class will perform a Bank
 * Transaction of depositing or withdrawing money.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Transaction
{
    //fields
    private int accountNum;
    private char transactionType;
    private double amount;
    
    //constructor
    public Transaction(int act, char dw, double a)
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
    public char getTransactionType () 
    { 
         return transactionType; 
    }
    public double getTransactionAmount () 
    { 
         return balance; 
    }
}