
/**
 * Write a description of class AudioBook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AudioBook extends Book
{
    private int minutes;
    public AudioBook(String title, int pages)
    {
        super(title, pages);
        minutes = 0;
    }
    public String getType()
    {
        return "AudioBook"; 
    }
}
