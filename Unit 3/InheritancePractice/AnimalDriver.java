 
/**
 * Write a description of class AnimalDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AnimalDriver
{
    public static void main (String[] args)
    {
        //a = new Animal(); - bad becase abstract 
        Dog d = new Dog(); 
        d.sleep(); 
        d.play(7); 
        
        Dog snoopy = new Dog(); 
        snoopy.cuddle();
        Cat felix = new Cat(); 
        
        //polymorphism 
        Animal myAnimal  = new Dog();
        //myAnimal.cuddle();//cannot do
        myAnimal = new Cat();
        
        Pet mama = new Dog(); 
        mama.cuddle();
        Pet fluffy = new Cat(); 
        Pet silly = new Dog(); 
        Pet willy = new Dog(); 
        Pet duffy = new Cat(); 
        
        //arrays to group items
        Cat[] myCats = {felix};   
        Pet[] myPets = {mama, fluffy, silly, willy, duffy, snoopy, felix}; 
    }
}
