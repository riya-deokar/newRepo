import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
/**
 * Lab #2 - Create an Instrument
 * @author: (YOUR NAME HERE)
 */

public class Key extends Actor
{
    /**
     * Create a new key.
     */
    
    String key = "insert imageKey"; 
    String sound = "play Sound";
    String up = "displayUpKey"; 
    String down = "displayDownKey";
    
    public Key(String keyPress, String soundFile, String upfileName, String downfileName)
    {
        key = keyPress;  
        sound = soundFile; 
        up = upfileName; 
        down = downfileName; 
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        playKey();
    }

    public void playKey() // diffrenciates if the Key is down or up by using images and plays a sound when the Key is pressed 
    {
        if (Greenfoot.isKeyDown(key))
        {
            setImage (down);
            Greenfoot.playSound (sound);
        }
        else 
        {
            setImage (up);
        }
    }
}

