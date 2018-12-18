import java.util.*; 
/**
 * Write a description of class listDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class listDriver
{
    public static void main( String[] args)
    {
        //create an array list of Strings called myWords
        ArrayList<String>myWords = new ArrayList<String>();
        myWords.add("banana");
        myWords.add("banana");
        myWords.add("goat");
        myWords.add(0, "banana");
        myWords.add("banana");
        myWords.add(3, "fish");
        myWords.set(5, "apple"); 
        
        //current size = 5
        //positions 0-5
        //myWords.add(10, "pepper"); - cannot skip positions  
        
        //get item in 3rd index 
        System.out.println(myWords.get(3)); 
        
        //print the index of banana 
        System.out.println(myWords.indexOf("banana"));
        
        //print the size of the list 
        System.out.println(myWords.size()); 
        
        //remove the banana's
        //myWords.remove("banana"); 
        
        
        //try to remove the banana's
        //REMOVAL PROBLEM (occurs every year in AP test)
        //approaches vvv
        
        //approach #1 
        int index=0; 
        for(int i=0; i<myWords.size(); i++)
        {
            if (myWords.get(index).equals("banana"))
            {
                myWords.remove(index); 
            }
            else 
            {
                index+=1; 
            }
        }
        //approach #2: backwards through the list 
        for(int i=myWords.size()-1; i>=0; i--)
        {
            if (myWords.get(index).equals("banana"))
            {
                myWords.remove(1); 
            } 
        }
        //approach #3: be carefule with more complex objects to remove 
        while(myWords.contains("banana") == true)
        {
            myWords.remove("banana"); 
        }
        //approach #4: jump back when you remove something 
        for(int i=0; i<myWords.size(); i++)
        {
            if(myWords.get(i).equals("banana"))
            {
                myWords.remove(i); 
                i--; 
            }
        }
        //approach #5
        for(String n:myWords)
        {
            if(n.equals("banana"))
            {
                myWords.remove(n); 
            }
        }
        System.out.println(myWords);
     }
}
