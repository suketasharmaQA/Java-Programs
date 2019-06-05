import java.util.Scanner;

public class NearestPalindrom 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int orginal_num = input;
		int reverse_num1;
		int reverse_num2;
		int temp;
		int mod;
		int num;
		for(int i = input; ; i++)
		{
			temp =0;
			
			num = i;
			while(num != 0)
			{
				mod = num % 10;
				temp = (temp *10) + mod;
				num/= 10;
			}
			if(i==temp)
			{
				reverse_num1 = temp;
				break;
			}
		}
		for(int i = input; ; i--)
		{
			temp =0;
			
			num = i;
			while(num != 0)
			{
				mod = num % 10;
				temp = (temp *10) + mod;
				num/= 10;
			}
			if(i==temp)
			{
				reverse_num2 = temp;
				break;
			}
		}
		

	   int diff1 = Math.abs(orginal_num-reverse_num1);
	   int diff2 = Math.abs(orginal_num-reverse_num2);
		
	   if(diff1 < diff2)
	   {
		   System.out.println(reverse_num1);
	   }
	   else
		   System.out.println(reverse_num2);
		
	}
}
