import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Dups_Hash_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stu	b
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		System.out.println("How many strings you would like to add?");
		int num = sc.nextInt();
		System.out.println(sc.nextLine());
		System.out.println("Enter the strings");
		for(int i =0; i<num; i++)
		{
			map.put(i,sc.nextLine());
		}
		System.out.println(map);
	//	Collection<String> translations = map.values();
		
		Set<String> unique_set = new HashSet<String>();
		
		for (String t : map.values()) {
			    if (Collections.frequency(map.values(), t) > 1) {
			    	unique_set.add(t);
			    	
			    	
			    	
			    }
		}
		map.values().removeAll(unique_set);
		//removeAll(unique_set);
		System.out.println(unique_set);
		System.out.println(map);
	}  

}
