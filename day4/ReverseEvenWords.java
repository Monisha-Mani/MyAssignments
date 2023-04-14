package week2.day2;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] split=test.split(" ");
		char tempChar;
		String updatedString="", newString="";
		
		for(int i=0;i<split.length;i++) {
			
			if((i+1)%2==0) {
				for(int j=0;j<split[i].length();j++) {
					tempChar= split[i].charAt(j);
					newString=tempChar+newString;
				}
			}	
				else {
					newString=split[i];
				}
			
				updatedString= updatedString+"  "+newString;
				newString="";
			}
			
		System.out.println(" "+updatedString+" ");	
		}
	
}

