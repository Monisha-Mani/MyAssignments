package assignmentWeek3;


import java.util.Map;
import java.util.TreeMap;

public class FindNumberOfOccurances {
	public static void main(String[] args) {
		int[] number= {2,3,5,6,3,2,1,4,2,1,6,-1};
		Map<Integer,Integer> map= new TreeMap<>();
		
		for(int i=0;i<number.length;i++) {
			int  temp=number[i];
			if(map.containsKey(temp)) {
				map.put(temp, map.get(temp)+1);
			}
			else
			{map.put(temp, 1);
			
			}
		}
		System.out.println(map);
	}
}
