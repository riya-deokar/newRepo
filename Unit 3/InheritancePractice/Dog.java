public class Dog extends Animal implements Pet, Friendly, AnimalSwimmer
{
    //fields
    private double swimDist; 
    
    //constrcutors
    public Dog()
    {
        swimDist=0; 
    }
    
    //methods
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
    public void Swim(double distance) 
    {
        distance += swimDist; 
    }
    public double getSwimDistance()
    {
        return swimDist; 
    }
}