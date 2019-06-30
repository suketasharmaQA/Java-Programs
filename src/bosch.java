
public class bosch 
{
	public static void main(String[] args)
	{
		String str= "tester1256ksjf22";
		int sum=0;

		for(int i = 0; i< str.length(); i++)
		{
			if(Character.isAlphabetic(str.charAt(i)))
			{
				System.out.print(str.charAt(i));
			}
		}
		System.out.println();
		char c;
		for(int i = 0; i< str.length(); i++)
		{
			
			if(Character.isDigit(str.charAt(i)))
			{
				c = str.charAt(i);
				sum+=Character.getNumericValue(c);
			
			}
			
		}
		System.out.println(sum);
	}
}
