package week1.day2;

public class FindIntersection {
	public static void main(String[] args) {

		int arrayOne[] = {3,2,11,4,6,7};
		int arrayTwo[] = {1,2,8,4,9,7};
		System.out.print("The intersected number from array are ");
		for (int i=0; i<arrayOne.length;i++) {
			for (int j=0; j<arrayTwo.length;j++)
			{
				if(arrayOne[i]==arrayTwo[j])
					System.out.print(arrayOne[i] + " ");
			}
		}
					
	}
		
}
