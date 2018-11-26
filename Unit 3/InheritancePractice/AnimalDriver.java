
/**
 * Write a description of class AnimalDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AnimalDriver
{
    public static void main (String[] args)
    {
        //a = new Animal(); - bad becase abstract 
        Dog d = new Dog(); 
        d.sleep(); 
        d.play(7); 
    }
}
