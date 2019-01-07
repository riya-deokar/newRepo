
/**
 * Write a description of class ApartmentBuilding here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ApartmentBuilding extends Building 
{
    // instance variables - replace the example below with your own
    private double[] aptWattHours; 
    private int numberApartments; 

    /**
     * Constructor for objects of class ApartmentBuilding
     */
    public ApartmentBuilding(String ad, int number)
    {
        super(ad);   
        numberApartments = number;
        aptWattHours = new double[numberApartments];
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double amtOwed( )
    {
       double sumHours=0;
       for(int i=0; i<aptWattHours.length; i++)
       {
            sumHours += aptWattHours[i];  
       }
       System.out.println(super.getRate()*sumHours); 
       return super.getRate()*sumHours; 
    }
    public void setApartmentHours( double[] hours )
    {
       for(int i=0; i<aptWattHours.length; i++)
       {
          aptWattHours[i] = hours[i];
       }
    }
}
