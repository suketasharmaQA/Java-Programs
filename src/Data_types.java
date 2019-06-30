import java.util.Scanner;

public class Data_types {

	public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

	        /* Declare second integer, double, and String variables. */
	         int var1 = scan.nextInt();
	        double var2 = scan.nextDouble();
	        scan.nextLine();
	        String var3 = scan.nextLine();
	
	        /* Read and save an integer, double, and String to your variables.*/
	        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
	
	        /* Print the sum of both integer variables on a new line. */
	        System.out.println(Math.abs(var1)+i);
	        /* Print the sum of the double variables on a new line. */
			System.out.println(Math.abs(var2)+d);
	        /* Concatenate and print the String variables on a new line; 
	        	the 's' variable above should be printed first. */
	   //     System.out.println(s+var3);

	}

}
