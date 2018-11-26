
/**
 * Write a description of class StudentAdvance here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentAdvance extends Advance 
{
    // instance variables - replace the example below with your own
    private int daysAdvance;

    /**
     * Constructor for objects of class StudentAdvance
     */
    public StudentAdvance(int days)
    {
        // initialise instance variables
        super(days); 
        days = 0;
        daysAdvance = days; 
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double getPrice()
    {
        double student; 
        if(daysAdvance >= 10)
        {
            student = 30; 
        }
        else
        {
            student = 40; 
        }
        return student; 
    }
}
