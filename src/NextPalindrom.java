import java.util.Scanner;

public class NextPalindrom {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number to find next palindrom");
		int input = sc.nextInt();
		int orginal_input = input;
		int reverse_num ;
		int mod;
		for(int i=input;;i++) 
		{
			int num = i ;
			reverse_num = 0 ;
			// mod is always the digit at unit place and quotient is always the rest number
			// so new number / reverse_num will be (first, 0 then from next mode*10 + new mod)
			// uptil the quotient becomes 0
			while(num!=0)
			{
				mod = num%10;
				reverse_num = (reverse_num*10) + mod;
				num /=10;
			}
			if(i == reverse_num)
				{
				System.out.println("Next palindrom is:" +reverse_num);
				break;
				}
				
			
			
		}
			
	//sc.close();

	}

}
