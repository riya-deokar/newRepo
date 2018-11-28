
/**
 * Write a description of class Advance here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Advance extends Ticket 
{
    // instance variables - replace the example below with your own
    private int daysAdvance;

    /**
     * Constructor for objects of class Advance
     */
    public Advance(int days)
    {
        // initialise instance variables
        super(); 
        daysAdvance = 0;
        daysAdvance = days; 
    }

    /**
     * Tickets purchased >= ten days in advance cost $30
     * Tickets purchased <= nine days in advance cost $40
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double getPrice()
    {
        // put your code here
        double price; 
        if(daysAdvance >= 10)
        {
            price = 30; 
        }
        else
        {
            price = 40; 
        }
        return price; 
    }
}
