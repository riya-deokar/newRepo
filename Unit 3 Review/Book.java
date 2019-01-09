
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Book
{
    private String myTitle;
    private int numPages;
    private int currentPage;
    
    public Book(String title, int pages)
    {
        myTitle = title;
        numPages = pages;
        currentPage = 0;
    }
    
    public abstract String getType();
    
    public String toString()
    {
        return "Book title: "+myTitle+", number of pages: "+numPages;
    }
    public void useBook()
    {
        System.out.println("Read a page");
        currentPage++;
    }
}
