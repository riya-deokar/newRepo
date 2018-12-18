
/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicle extends TaxableItem 
{
    private double dCost; 
    private double dMarkup;
    public Vehicle(double cost, double markup, double taxRate) 
    {
        super(taxRate);
        dCost = cost;
        dMarkup = markup;
    }
    
    public double getListPrice()
    {
        return dCost + dMarkup; 
    }
    
    public void changeMarkup(double value)
    {
        dMarkup = value;  
    }
}
