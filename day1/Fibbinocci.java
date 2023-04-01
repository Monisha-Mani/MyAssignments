package week1.day1;

public class Fibbinocci {
 public static void main(String[] args) {
	int firstNumber=0;
	int secondNumber=1;
	int sum=0;
	
	for(int i=1;i<=11;i++)
	{
		System.out.print(firstNumber+" ");
		sum = firstNumber + secondNumber;
		firstNumber = secondNumber;
		secondNumber = sum;
		
		
	}
}
}
