package assignmentWeek3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetAssignment {
	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> s=new TreeSet<>();
		  for (int i = 0; i < data.length; i++) {
		    	s.add(data[i]);		
		  }
		System.out.println(s);
		int length=s.size();
		List<Integer> l= new ArrayList<>();
		l.addAll(s);		
		
		System.out.println("Second largest number is "+l.get(length-2));
				
	}
}
