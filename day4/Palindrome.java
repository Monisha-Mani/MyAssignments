package week2.day2;

public class Palindrome{
	public static void main(String[] args) {
		String palindrome="madam";
		String rev="";
		int l = palindrome.length();
		char[] charArray = palindrome.toCharArray();
		for(int i=l-1; i>=0;i--) {
			rev=rev+charArray[i];
			
		}
		if(palindrome.equals(rev))
			System.out.println("Both are same");
		else
			System.out.println("Both are not same");
	}

}
