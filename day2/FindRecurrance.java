package week1.day2;

public class FindRecurrance {
	public static void main(String[] args) {
		int[] givenNumbers = {1,5,7,8,9,0,4,5,2,3,11,21,32,5,23,67};
		
		int recurranceCount=0;
		
		for(int i=0; i<givenNumbers.length; i++)
		{
			if(givenNumbers[i]==5)
				recurranceCount++;
			else
				continue;
		}
		
		System.out.println("5 is recurred "+ recurranceCount + " times");
	}
	
	
}
