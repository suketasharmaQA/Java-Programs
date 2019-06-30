

import java.util.Scanner;

public class Copy5elementsandSleep 
{


	// Libraries included:
	// json simple, guava, apache commons lang3, junit, jmock

	// Test cases:
	//1) Input as positive integer, Copy 5 elements and store the last index
	//2) Negative integer is not allowed
	// Alphabets and others are not allowed
	
	
	    public static void main(String[] args) throws InterruptedException 
	    {
	        int old_array[] = new int[10];
	        int new_array[] = new int[10];
	        int input;
	        int length = old_array.length;
	        System.out.println("Enter your inputs");
	        System.out.println(length);
	        Scanner sc = new Scanner(System.in);
	        
	        for(int i=0; i < length; i++)
	        {
	            try
	            {
	            	old_array[i] = sc.nextInt();
	            }
	            catch(Exception e)
	            {
	            	System.out.println("not a valid input");
	            }
	             
	                
	        }
	        System.out.println(old_array);
	         for (int j =0; j< old_array.length; j++)
	          {
	              new_array[j] = old_array[j];
	              if(j%5==0)
	              {
	            	  System.out.println("Sleeping....");
	                    Thread.sleep(500);
	            	  
	              }
	              
	          }
	         for(int i: new_array)
	         {
	        	 System.out.println(i);
	         }
	             
	        
	    }
}



