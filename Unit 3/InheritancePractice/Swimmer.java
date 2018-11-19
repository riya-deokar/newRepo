
/**
 * Write a description of class Swimmer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Swimmer extends Athlete 
{
    //fields 
    private String swimStroke;
    
    //construtructors - strict guidelines for subclass 
    public Swimmer(boolean injury, String ss)
    { 
        //hasInjury = injure; // this is bad!!! do NOT do this
        //very first line of subclass constructor must call super constructor 
        super(injury); // 100% mandatory all the time; has to be first statement 
        swimStroke = ss;  
    }
    //methods 
    public void printSwimStroke()
    {
        System.out.println ("My favorite swimStroke is " + swimStroke); 
    }
    
    /**
     * write a method called printWorkoutSummary
     * overidding a superclass method
     * update the superclass method so that this method ill print:
     * My favorite swimstorke is -- 
     * Athlete has worked out -- hours and isInjured: true/false 
     */
    public void printWorkoutSummary() 
    {
        printSwimStroke(); 
        super.printWorkoutSummary(); // optional
    }
   
}
