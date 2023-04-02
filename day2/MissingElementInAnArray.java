package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {
	public static void main(String[] args) {

		int arrayOne[] = { 1, 2, 3, 4, 7, 6, 8 };
		int length;
		Arrays.sort(arrayOne);
		int i = arrayOne[0];
		for (length = 0; length < arrayOne.length; length++) {
			if (i == arrayOne[i - 1]) {
				i++;
			} else {
				System.out.println("Missing value in array is " + i);
				break;

			}
		}
	}

}


