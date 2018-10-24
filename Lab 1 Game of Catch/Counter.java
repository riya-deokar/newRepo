import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Counts amount of fish main character eats
 * 
 * @author (Riya Deokar) 
 * @version (10/23/18)
 */
public class Counter extends Actor
{
    int total = 0; 
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("Total : " + total, 24, Color.WHITE, Color.BLACK));
    }    
    public void addTotal()// allows Counter to add numbers when Dolphin eats the fish prey  
    {
        total++;
    }
}
