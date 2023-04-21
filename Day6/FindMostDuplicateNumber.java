package assignmentWeek3;

import java.util.Collections;
import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;

public class FindMostDuplicateNumber {
	public static void main(String[] args) {
		
		Map<Character,Integer> map= new HashMap<>();
		String name="abbaba";
		for(int i=0;i<name.length();i++) {
			char c=name.charAt(i);
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			
			}
		}
		System.out.println(map);
		
		int mostDuplicate=(Collections.max(map.values()));
		
		for (Entry<Character, Integer> entry:map.entrySet())
		{
			if(entry.getValue()==mostDuplicate)
			{
				System.out.println("The most Duplicate is "+mostDuplicate +" "+entry.getKey());
				break;
			}
		}
}
}
