package assignmentWeek3;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class SortUsingCollection {
	public static void main(String[] args) {
		String[] str= {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		int length=str.length;
		Arrays.sort(str);
		Set<String> set=new LinkedHashSet<String>();
	
		for(int i=length-1;i>=0;i--) {
			set.add(str[i]);
		}
		
		System.out.println(set);
	}
}
