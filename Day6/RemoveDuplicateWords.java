package assignmentWeek3;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] strArray=text.split(" ");
		int length=strArray.length;
		Set<String> s=new LinkedHashSet<String>();
		for(int i=0;i<length;i++) {
			s.add(strArray[i]);
		
		}
		System.out.println(s);
		
}
}
