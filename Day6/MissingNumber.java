package assignmentWeek3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		int[] number= {1,2,3,4,5,6,8,9,2,4,6,8,4,6,8};
		Set<Integer> s=new TreeSet<>();
		int l=number.length;
		for(int i=0;i<l;i++) {
			s.add(number[i]);
		
		}
		
		List<Integer> list = new ArrayList<>();
		list.addAll(s);
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			if(list.get(i)==i+1) {
				continue;
			}
			else {
				int missingNumber=++i;
				System.out.println("Missing no. is "+ missingNumber );
			}
		}
		
	}
	
}
