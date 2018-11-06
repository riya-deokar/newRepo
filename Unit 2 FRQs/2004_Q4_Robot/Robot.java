
/**
 * Write a description of class Robot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Robot
{
    private int[] hall;
    private int pos; //current position (title number) of robot
    private boolean facingRight; //true means this robot is facing right
    
    //constructor not shown in question
    public Robot(int[] h, int p, boolean fr)
    {
        hall = h;
        pos = p;
        facingRight = fr;
    }
    
    /**
     * postcondition: returns true if this Robot has a wall immediately in
     * front of it, so that it cannot move forward;
     * otherwise, returns false
     */
    public boolean forwardMoveBlocked()
    {
        return (!facingRight && pos==0) || (facingRight && pos==hall.length-1); 
    }
    
    /**
     * postcondition: one move has been made according to the
     * specification above and the state of this
     * Robot has been updated
     */
    public void move()
    {
        if (hall[pos] > 0)
        {
            hall[pos]--;
            if (hall[pos] == 0)
            {
                if (forwardMoveBlocked())
                facingRight = !facingRight;
                else if (facingRight)
                pos++;
                else
                pos--;
            }
        }
    }
    
    /**
     * postcondition: no more items remain in the hallway;
     * returns the number of moves made
     */
    public int clearHall()
    {
        int count = 0; 
        while (!hallIsClear())
        {
            move();
            count++;
        }
        return count; 
    }
    
    /**
     * postcondition: returns true if the hallway contains no items;
     * otherwise returns false
     */
    private boolean hallIsClear()
    {
        for(int n=0; n<hall.length; n++)
        {
            if(hall[n]!=0)
            {
                return false;
            }
        }
        return true;
    }
    
    //added methods for testing - Do not alter
    public int[] getHall()
    {
        return hall;
    }
    public boolean getDirection()
    {
        return facingRight;
    }
    public int getPosition()
    {
        return pos;
    }
}
