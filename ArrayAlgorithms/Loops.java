public class Loops
{
    public static void main(String[] args)
    {
        int[] myNums = {1, 9, 5, 3, 8, 7}; 
        
        //regular for loop - find the sum of the numbers 
        int sumRegular = 0; 
        
        for(int i = 0; i<myNums.length; i++)
        {
            sumRegular+=myNums[i]; 
        }
        System.out.println(sumRegular); 
        
        //enhnaced for loop to find the sum of the numbers 
        int sumEnhanced = 0;  
        
        for(int num: myNums) 
        {
            sumEnhanced+=num; //don't need to grab the number from the array
        }
        System.out.println(sumEnhanced); 
    }
}