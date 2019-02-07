
/**
 * Write a description of class ArrayDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayDriver
{
    public static void main (String[] args)
    {
        // 2D array of ints with 3 rows and 2 columns called myNums
        //int[][] myNums = new int[3][2]; 
        int[][] myNums = {{1, 2}, {3, 4}, {5, 6}}; 
        
        //get the number of rows - numRows
        int numRows = myNums.length; 
        System.out.println("Rows:"+numRows); 
        
        //get the number of columns - numCols
        int numCols = myNums[0].length; 
        System.out.println("Cols:"+numCols);
        
        //print the 2D array myNums
        //System.out.println(myNums); - prints the memory location 
        //go thorugh every element and print them 1 by 1
        //loop through all the rows
        for(int r=0; r<myNums.length; r++)
        {
            for(int c=0; c<myNums[r].length; c++)
            {
                System.out.print(myNums[r][c]+"\t"); 
            }
            System.out.println(); 
        }
        
        //enhanced for loop through 2D array 
        for(int[] row: myNums)
        {
            for(int num: row)
            {
                System.out.print(num+"\t");
            }
            System.out.println(); 
        }
        
        //calculate the average of the value in the 2D arrays 
        //print the average
        double x=0;  
        for(int r=0; r<myNums.length; r++)
        {
            for(int c=0; c<myNums[r].length; c++)
            {
                x += myNums[r][c];
            }
        }
        System.out.println("average:"+x/(myNums.length*myNums[0].length)); 
        //create an array that is a transpose of myNums; 
    }
}
