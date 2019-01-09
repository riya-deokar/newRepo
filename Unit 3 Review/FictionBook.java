
/**
 * Write a description of class FictionBook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FictionBook extends Book
{
    public FictionBook(String title, int pages)
    {
        super(title, pages);
    }
    public String getType()
    {
        return "FictionBook"; 
    }
}
