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
        //addObject(new Key("a", "2a.wav", "white-key.png", "white-key-down.png"), 30, 100);
        //addObject(new Key("b", "2b.wav", "white-key.png", "white-key-down.png"), 60, 100);
        //addObject(new Key("c", "2c.wav", "white-key.png", "white-key-down.png"), 90, 100);
        //addObject(new Key("d", "2d.wav", "white-key.png", "white-key-down.png"), 120, 100);
        //addObject(new Key("e", "2e.wav", "white-key.png", "white-key-down.png"), 150, 100);
        //addObject(new Key("f", "2f.wav", "white-key.png", "white-key-down.png"), 180, 100);
        //String[] whiteKeys = new String[12];
        //String[] whiteNotes = new String [12]; 
        String[] whiteKeys = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "[", "]"}; 
        String[] whiteNotes = {"3c.wav", "3d.wav", "3e.wav", "3f.wav", "3g.wav", "3a.wav", "3b.wav", "4c.wav", "4d.wav", "4e.wav", "4f.wav", "4g.wav"};
        placeKey(); 
    }
    private void placeKey() // using a while loop and taking into consideration the paramters constructed 
    {
        int x = 0 ; 
        String[] whiteKeys = new String[12]; 
        String[] whiteNotes = new String [12];
        //Key wkey = new Key
        while(x < whiteKeys.length)
        {
            Key wKey = new Key(whiteKeys[x], whiteKeys[x]+".wav", "white-key.png", "white-key-down.png"); 
            addObject(wKey, 30+(x*60), 100); 
            x = x+1; 
        }
    }
}