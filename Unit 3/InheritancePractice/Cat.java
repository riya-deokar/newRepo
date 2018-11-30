
/**
 * Write a description of class Cat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cat extends Animal implements Pet, Friendly
{
    public void eat()
    {
        System.out.println("I love to eat meat!"); 
    }
    public void play(int duration)
    {
        System.out.println("Playing with owner for " + duration + "minutes");
    }
    public void playWithOwner()
    {
        play(5);
    }
    public void cuddle()
    {
        System.out.println("Cuddling wiht owner on couch"); 
    }
    public void beNice()
    {
        System.out.println("Hi owner I love you"); 
    }
    
}
