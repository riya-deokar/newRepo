import java.util.*; 
/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library
{
    public static void main(String[] args)
    {
        NonfictionBook nb = new NonfictionBook ("a", 19);
        FictionBook fb = new FictionBook ("b", 32);
        ColoringBook cb = new ColoringBook ("c", 45);
        AudioBook ab = new AudioBook ("d", 83);
        
        nb.useBook();
        fb.useBook();
        cb.useBook(); 
        ab.useBook();
        
        Book b = new ColoringBook("Hi", 89); 
        b.useBook();
        //b.tearOutPage(); 
        
        ArrayList<Book>myBooks = new ArrayList<Book>();
        myBooks.add(nb); 
        myBooks.add(fb); 
        myBooks.add(cb); 
        myBooks.add(ab); 
        
        //enhanced for loop 
        //go through all the books in myBooks 
        for(Book temp: myBooks)
        {
            System.out.println(temp.toString()); 
        }
        //convert this to a regular for loop 
        for(int x=0; x<myBooks.size();x++)
        {
            System.out.println(myBooks.get(x).toString()); 
        }
    }
}
