import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kölling
 * @author: (YOUR NAME HERE)
 * @version: 0.1
 */
public class Piano extends World
{
    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);
        addObject(new Key("a", "2a.wav", "white-key.png", "white-key-down.png"), 30, 100);
        addObject(new Key("b", "2b.wav", "white-key.png", "white-key-down.png"), 60, 100);
        addObject(new Key("c", "2c.wav", "white-key.png", "white-key-down.png"), 90, 100);
        addObject(new Key("d", "2d.wav", "white-key.png", "white-key-down.png"), 120, 100);
        addObject(new Key("e", "2e.wav", "white-key.png", "white-key-down.png"), 150, 100);
        addObject(new Key("f", "2f.wav", "white-key.png", "white-key-down.png"), 180, 100);
    }
}