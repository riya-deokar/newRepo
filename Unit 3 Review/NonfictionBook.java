
/**
 * Write a description of class NonfictionBook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NonfictionBook extends Book
{
    public NonfictionBook(String title, int pages)
    {
        super(title, pages);
    }
    
    public String getType()
    {
        return "Nonfiction book";
    }
}
