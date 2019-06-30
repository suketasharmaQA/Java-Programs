import java.util.Scanner;
import java.lang.Math;
public class Operators {
	
	 static void solve(double meal_cost, int tip_percent, int tax_percent) 
	 {

	        double total_cost = meal_cost + ((tip_percent*meal_cost)/100) + ((tax_percent*meal_cost)/100);
	        System.out.println(Math.round(total_cost));

	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }


}
