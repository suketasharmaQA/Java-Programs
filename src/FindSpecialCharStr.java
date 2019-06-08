
public class FindSpecialCharStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= " My email address is suketasharma1234@gmail.com  - #1";
		int intcount=0;
		int charcount=0;
		int specialchar =0;
		for( int i =0; i < str.length(); i++) 
		{
			if(Character.isDigit(str.charAt(i)))
			{
				intcount++;
			}
			else if(Character.isAlphabetic(str.charAt(i)))
			{	
				charcount++;
			}
			else
			{
				specialchar++;
			
			}
			
		}
		System.out.println("Integer in string are: "+intcount);
		System.out.println("Character in string are: "+charcount);
		System.out.println("Special character in string are: "+specialchar);
// _________________________________________________________________________
		// if to display only special character
		for( int j =0; j < str.length(); j++) 
		{
			if(!Character.isDigit(str.charAt(j)) && !Character.isAlphabetic(str.charAt(j)) && !Character.isWhitespace(str.charAt(j)))
			{
				System.out.println("Special characer in string is: " +str.charAt(j));
			}
		}
				

	}

}
