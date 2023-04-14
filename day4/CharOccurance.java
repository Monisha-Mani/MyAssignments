package week2.day2;

public class CharOccurance {
	public static void main(String[] args) {
		String str = "Welcome to chennai";
		char[] charArray = str.toCharArray();
		int length=str.length();
		int recurranceCount=0;
		
		for(int i=0; i<length; i++)
		{
			if(charArray[i]=='e')
				recurranceCount++;
			else
				continue;
		}
		System.out.println("e is Occurred "+ recurranceCount + " times");
	}
	
	
}
