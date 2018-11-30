public abstract class Animal 
{
    //field
    
    //constructors
    
    //methods
    public void sleep()
    {
        System.out.println("I am sleeping..zzzzzzz"); 
    }
    public void play(int duration)
    {
        System.out.println("playing with owner" + duration); 
    }
    //abstract method 
    //has no code -- all it is, is a method signature 
    public abstract void eat(); 
}
