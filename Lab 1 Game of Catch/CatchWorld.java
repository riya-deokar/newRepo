import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)
/**
 * Main character 
 * 
 * @author (Riya Deokar) 
 * @version (10/23/18)
 */
public class CatchWorld extends World
{ 
    Counter counter = new Counter(); 
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CatchWorld() 
    {
        super(800, 700, 1);
        addObject(); 
    }
    public Counter getCounter()
    {
        return counter; 
    }
    public void addObject()
    {  
        addObject(counter, 50, 30);
        
        Dolphin dodo = new Dolphin();
        addObject(dodo, (int)(800*Math.random()), (int)(700*Math.random()));
        
        Fish fishy1 = new Fish();
        addObject(fishy1, (int)(800*Math.random()), (int)(700*Math.random()));
        Fish fishy2 = new Fish();
        addObject(fishy2, (int)(800*Math.random()), (int)(700*Math.random()));
        Fish fishy3 = new Fish();
        addObject(fishy3, (int)(800*Math.random()), (int)(700*Math.random()));
        Fish fishy4 = new Fish();
        addObject(fishy4, (int)(800*Math.random()), (int)(700*Math.random()));
        Fish fishy5 = new Fish();
        addObject(fishy5, (int)(800*Math.random()), (int)(700*Math.random()));
        
        Shark sharky1 = new Shark();
        addObject(sharky1, (int)(800*Math.random()), (int)(700*Math.random()));
        Shark sharky2 = new Shark();
        addObject(sharky2, (int)(800*Math.random()), (int)(700*Math.random()));
        Shark sharky3 = new Shark();
        addObject(sharky3, (int)(800*Math.random()), (int)(700*Math.random()));
    }

}