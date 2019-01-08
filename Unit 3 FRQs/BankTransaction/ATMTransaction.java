
/**
 * Write a description of class ATMTransaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ATMTransaction extends Transaction
{
    //fields
    private String location;

    //constructor
    public ATMTransaction(int act, char dw, double bal, String loc)
    { 
        super(act, dw, bal);
        location = loc; 
    }
    
    //method
    public String getATMLocation()
    {
        return location; 
    }
}
