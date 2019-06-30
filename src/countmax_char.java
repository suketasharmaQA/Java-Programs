import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class countmax_char
{
    public static void main(String[] args)
    {
    	System.out.println("Enter a string") ;    
    	Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
          
        char[] letters = str.toLowerCase().toCharArray();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap();
        for(int i=0; i<letters.length;i++)
        {
        	int count=1;
        	if(!map.containsKey(letters[i]))
        	{
        		for(int j=i+1; j<letters.length; j++)
        		{	
        			if(letters[i]==letters[j])
        			{
        				count++;

        			}
                
        			

        		}
        		map.put(letters[i], count);
        		
        		
        		
        	}
            
            
            

        }
        Map.Entry<Character, Integer> maxEntry = null;
        

        for (Map.Entry<Character, Integer> entry : map.entrySet())
        {
        	
        	
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
            {
                maxEntry = entry;
            }
        }
        System.out.println(maxEntry.getValue() );
    	System.out.println(maxEntry.getKey() ); 	
    	System.out.println(maxEntry.hashCode());
        System.out.println(maxEntry);
        System.out.println(map);
        sc.close();
    }
}
