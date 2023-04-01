package week1.day1;
import java.util.Scanner;
public class IsPrime {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);    
		System.out.print("Enter number: ");  
		int number= sc.nextInt(); 
		
		boolean isPrime = true;
		for (int i=2; i <= number-1; i++)
        {
            if ( number % i == 0)
            {
                isPrime = false;
                break;
            }
        }
 
        if ( isPrime == true )
            System.out.println(number + " is a prime number");
        else
            System.out.println(number + " is not a prime number");
	}

}
