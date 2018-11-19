


/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver
{
    public static void main( String[] args)
    {
        //construct an athlete called mike with an injury 
        Athlete Mike = new Athlete(true); 
        //construct an athlete ally with no injury 
        Athlete Ally = new Athlete(false);
        Swimmer Fefe = new Swimmer(true, "butterfly"); 
        
        Mike.workout(2); 
        Ally.workout(3.5, "walking");
        Fefe.workout(3); 
        
        double mhr = Mike.getHours(); 
        double ahr = Ally.getHours();
        double fhr = Fefe.getHours(); 
        
        System.out.println(mhr);  
        System.out.println(ahr);  
        System.out.println(fhr);  
        Fefe.printSwimStroke(); 
        
        //mike.printSwimStroke(); - does not exist in class 
        System.out.println ("Mike's workout"); 
        Mike.printWorkoutSummary(); 
        System.out.println ("Ally's workout"); 
        Ally.printWorkoutSummary(); 
        System.out.println ("Fefe's workout"); 
        Fefe.printWorkoutSummary(); 
       
        
    }
}
