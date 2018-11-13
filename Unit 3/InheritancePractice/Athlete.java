/**
 * Athlete class
 * with two fields - one for the hours of 
 * practice and one for if they have injuries (hoursPractice and hasInjury)
 * 
 * a constrcutor wiht one parameter for the injury 
 * The constructor should set teh fields and 
 * hoursPace should start at 0 
 * 
 * write on method called workout with one parameter 
 * for how long. This should update the hours of 
 * pratice.
 */



public class Athlete 
{
    private int hoursPractice; 
    private boolean hasInjury; 
    public Athlete(boolean injury)
{
    hoursPractice = 0;
    hasInjury = injury; 
}
public void workout(double time)
{
    hoursPractice += time;
}
public double getHours()
{
    return hoursPractice;
}
public boolean getInjury()
{
    return hasInjury; 
} 
}

