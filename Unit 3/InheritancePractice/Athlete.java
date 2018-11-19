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
/** 
 * write a method called printWorkoutSummary
 * that is void and prints out a statement with the number of our the athlete
 * has worked out and if they are currently injured
 * Athlete has worked out -- and id injured: true/false 
 */
public void printWorkoutSummary() 
{
    System.out.println ("Athlete has worked out" +getHours() + "are they injures:" + getInjury()); 
} 
/**
     * change the workout method so it also lets me enter what kind of workout 
     * overoading - loads more parameters into the mehthod or changes parameter types 
     * increases hoursPractice and prints "workout type": -- 
     */
    
public void workout(double time, String type)
{
    hoursPractice+=time;  
    System.out.println("Workout type"+type);
}
    
}




