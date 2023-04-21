package assignmentWeek3;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
	
	String name="Paypal India";
	char[] nameArray=name.toCharArray();
	Set<Character> charSet=new TreeSet<>();
	Set<Character> dupCharSet=new TreeSet<>();
	char space=' ';
	
	for(int i=0;i<name.length();i++) {
		
	}
	for(int i=0;i<name.length();i++) {
		if(charSet.contains(nameArray[i])) {
			dupCharSet.add(nameArray[i]);
		}
		else {
			charSet.add(nameArray[i]);
		}
			
	}
	
	for (Character eachvalue:dupCharSet)
	{
		
		if(charSet.contains(eachvalue))
		{
			charSet.remove(eachvalue);
			
		}
	}
	charSet.remove(space);
	
	System.out.println(charSet + " are original letters");
	System.out.println(dupCharSet + " are duplicate letters");
	
	}
}
