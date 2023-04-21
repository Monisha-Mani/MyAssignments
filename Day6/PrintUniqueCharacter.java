package assignmentWeek3;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {
	public static void main(String[] args) {
		String name="Monisha";
		int length=name.length();
		char[] nameArray=name.toCharArray();
				
		Set<Character> uniqueChar=new HashSet<Character>();
		for(int i=0;i<length;i++) {
		if(uniqueChar.contains(nameArray[i]))
			uniqueChar.remove(nameArray[i]);
		else {
			uniqueChar.add(nameArray[i]);
		}
		
		}
		System.out.println(uniqueChar);
		
	}
}
