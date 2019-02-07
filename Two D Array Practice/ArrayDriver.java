
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
        
        /*
        //enhanced for loop through 2D array 
        for(int[] row: myNums)
        {
            for(int num: row)
            {
                System.out.print(num+"\t");
            }
            System.out.println(); 
        }
        */
        
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
        System.out.println("Average:"+x/(myNums.length*myNums[0].length)); 
        
        
        //create an array that is a transpose of myNums
        //1. create a new array 
        int[][] transpose = new int[myNums[0].length][myNums.length];
        //2. fill the transpose 
        for(int r=0; r<myNums.length; r++)
        {
            for(int c=0; c<myNums[r].length; c++)
            {
               transpose[c][r] = myNums[r][c]; 
               //transpose[r][c] = myNums[c][r]; 
            }
        }
        //3. print transpose 
        for(int[] row: transpose)
        {
            for(int num: row)
            {
                System.out.print(num+"\t");
            }
            System.out.println(); 
        }
        
        
        /**
         * turn the transpose 2D array into a 1D array. fiilled in colum-major order  --> colum loop on the outside 
         */
        //1. initialize 1D array
        //colum major 
        int loc = 0; 
        int[]oneD = new int[transpose.length*transpose[0].length];
        //2. exchange
        for(int c=0; c<transpose[0].length; c++)
        {
            for(int r=0; r<transpose.length; r++)
            {
                oneD[loc] = transpose[r][c];
                loc++; 
                //3. fill in 1D array with values from 2D array 
            }
        }
        //row major 
        /*
        for(int r=0; r<transpose; r++)
        {
            for(int c=0; c<transpose[0].length; c++)
            {
                oneD[loc] = transpose[c][r];
                loc++; 
                //3. fill in 1D array with values from 2D array 
            }
        }
        */
        //4. prinit array 
        for (int num:oneD)
        {
            System.out.print(num+"\t"); 
        }
    }
}
