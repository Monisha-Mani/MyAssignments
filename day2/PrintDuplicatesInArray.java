package week1.day2;

public class PrintDuplicatesInArray {
	public static void main(String[] args) {
		int[] arrayOne = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		for(int i=0; i<arrayOne.length;i++) 
		{
			for(int j= i+1;j<arrayOne.length;j++) 
			{
				if(arrayOne[i]==arrayOne[j])
				{
					System.out.println("Repeated value in array is "+ arrayOne[i]);
					
				}
				
			}
		}

	}
}
