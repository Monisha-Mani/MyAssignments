package week2.day2;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String text1="stops";
	String text2="potss";
	String t1="", t2="";
	if(text1.length()==text2.length()) {
		char[] charArray1 = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		for(int i=0;i<text1.length();i++) {
			t1= t1+charArray1[i];
			t2= t2+charArray2[i];
		}
		System.out.println("strings are "+t1+" and "+t2);
		if(t1.equals(t2)) {
			System.out.println("Both strings are Anagram");
		}
		else
			System.out.println("Both strings are not Anagrams");
	}
	else
		System.out.println("Strings are of different Length");
}
}
