	
public class FibonicciSeries {
	
	static int n3, n1=0, n2=1, count=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(n1 + " " + n2);
		printFibonacci(count-2);
	}
	
	public static void printFibonacci(int count)
	{
		while(count>0)
		{
			n3 = n2 + n1;
			System.out.print(" "+ n3);
			n1 = n2;
			n2 = n3;
			count--;
			
		}
	}

}
