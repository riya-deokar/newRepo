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
    //String[] whiteKeys = new String[12];
    //String[] whiteNotes = new String [12]; 
    private String[] whiteKeys = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "[", "]"}; 
    private String[] whiteNotes = {"3c", "3d", "3e", "3f", "3g", "3a", "3b", "4c", "4d", "4e", "4f", "4g"};
    private String[] blackKeys = {"2", "3", " " ,"5", "6", "7", "8", "9", "0", " ", "="}; 
    private String[] blackNotes = {"3c#", "3d#", " ", "3f#", "3g#", "3a#", " ", "4c#", "4d#", " ", "4f#"};  
    
    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(750, 340, 1);
        //addObject(new Key("a", "2a.wav", "white-key.png", "white-key-down.png"), 30, 100);
        //addObject(new Key("b", "2b.wav", "white-key.png", "white-key-down.png"), 60, 100);
        //addObject(new Key("c", "2c.wav", "white-key.png", "white-key-down.png"), 90, 100);
        //addObject(new Key("d", "2d.wav", "white-key.png", "white-key-down.png"), 120, 100);
        //addObject(new Key("e", "2e.wav", "white-key.png", "white-key-down.png"), 150, 100);
        //addObject(new Key("f", "2f.wav", "white-key.png", "white-key-down.png"), 180, 100);
        placeKey(); 
    }    private void placeKey() // using a while loop and taking into consideration the paramters constructed to place and create a key 
    {
        int x = 0 ; 
        while(x < whiteKeys.length)
        {
            Key wKey = new Key(whiteKeys[x], whiteNotes[x]+".wav", "white-key.png", "white-key-down.png"); 
            addObject(wKey, 30+(x*63), 140); 
            x = x+1; 
        }
        int y = 0; 
        while(y < blackKeys.length)
        {
            Key bKey = new Key(blackKeys[y], blackNotes[y]+".wav", "black-key.png", "black-key-down.png");
            addObject(bKey, 80+(y*63), 85); 
            y = y+1; 
        }
    }
}