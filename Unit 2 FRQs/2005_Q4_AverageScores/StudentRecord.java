/**
 * Write a description of class StudentRecord here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentRecord
{
    private int[] scores; //contains scores.length values
                            //scores.length>1
    
    //constructor and other data fields not shown in question
    public StudentRecord(int[] s)
    {
        scores = s;
    }
    
    /**
     * returns the average (arithmetic mean) of the values in scores
     * whose subscripts are between first and last, inclusive
     * precondition: 0<= first <= last < scores.length
     */
    public double average(int first, int last)
    {
        double sum = 0.0; 
        for (int n=first; n<=last; n++)
        {
            sum =+ scores[n]; 
        }
        return sum/(last-first+1);
    }
    
    /**
     * returns true if each successive value in scores is greater
     * than or equal to the previous value;
     * otherwise, returns false
     */
    public boolean hasImproved()
    {
        for (int n=0; n<scores.length-1; n++)
        {
            if (scores[n+1] < scores[n])
            {
                return false;
            }   
        }
        return true; 
    }
    
    /**
     * if the value in scores have improved, returns the average
     * of the elements in scores with indexes greater than or equal
     * to scores.length/2;
     * otherwise, returns the average of all of the values in scores
     */
    public double finalAverage()
    {
        if (hasImproved())
        {
            return average(scores.length/2, scores.length-1);
        }
        else
        {
            return average(0, scores.length-1);
        }
    }
}
