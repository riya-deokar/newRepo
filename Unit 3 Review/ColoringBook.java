
/**
 * Write a description of class ColoringBook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ColoringBook extends Book
{
    private int pagesColored;
    
    public ColoringBook(String title, int pages)
    {
        super(title, pages);
        pagesColored = 0;
    }
    public String getType()
    {
        return "coloring";
    }
    public void useBook()
    {
        System.out.println("color a book"); 
        pagesColored++; 
    }
}
