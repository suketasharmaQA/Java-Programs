	
public class FibonicciSeries {
	
	static int n3, n1=0, n2=1, count=100;
	static int n4, n5=0, n6=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(n1 + " " + n2);
		printFibonacci(count-2);
		System.out.println();
		System.out.print(n4 + " " + n6);
		recursive_way(count-2);
	}
	
	public static void printFibonacci(int count)
	{
		for(int i = count; i>0 ; i--)
		{
			n3 = n2 + n1;
			System.out.print(" "+ n3);
			n1 = n2;
			n2 = n3;
			//count--;
			
		}
	}
	

	public static void recursive_way(int count)
	{
		if(count>0)
		{
			n4 = n5+n6;
			System.out.print(" "+n4);
			n5 = n6;
			n6 =n4;
			recursive_way(count-1);
		}
	}
}
