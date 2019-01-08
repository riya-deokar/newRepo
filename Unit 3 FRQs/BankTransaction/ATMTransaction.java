
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
    public ATMTransaction(int act, String dw, double amt, String loc)
    { 
        super(act, dw, amt);
        location = loc; 
    }
    
    //method
    public String getATMLocation()
    {
        return location; 
    }
}
