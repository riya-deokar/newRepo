
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
        //very first line of subl=class constructor must call super constructor 
        super(injury); // 100% mandatory all f the time; has to be first statement 
        swimStroke = ss; 
    }
    //methods 
    public void printSwimStroke()
    {
        System.out.println ("My favorite swimStroke is " + swimStroke); 
    }
}
