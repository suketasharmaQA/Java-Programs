import java.util.Scanner;

public class LargerNumInArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the count of the numbers");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		System.out.println("Enter the input");
		Integer[] arr = new Integer[count];
		for(int i=0; i< count;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int max = arr[0];
		for(int i=1; i< count;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println(max);
		
		
		

	}

}
