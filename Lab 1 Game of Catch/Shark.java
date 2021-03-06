import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This chraacter eats main character
 * 
 * @author (Riya Deokar) 
 * @version (10/23/18)
 */
public class Shark extends GameCharacter
{
    /**
     * Act - do whatever the Shark wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveAround(); 
        turnAtEdge();
        randomTurn();
        lookForCatch();   
    }

    public void moveAround() // allows object to move across the screen 
    {
        move (5); 
    }    

    public void turnAtEdge() // allows object to turn if it reaches the edge of the world so it does not get stuck
    {
        turn ((int)(Math.random()*5)); 
    }

    public void randomTurn() // allows object to turn 10% of the time in a randomized path (left and right) 
    {
        if(Math.random()<=0.1)
        {
            turn((int)(Math.random()*5)); 
        }
    }

    public void lookForCatch() // allows object to eat character to catch if main game character has collided with it 
    {
        if(isTouching(Dolphin.class))
        {
            eat(Dolphin.class);
        }
    }
}   

