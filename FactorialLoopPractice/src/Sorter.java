import java.util.Random;
import java.util.Scanner;

public class Sorter {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random random = new Random();

		System.out.println("How large would you like your array to be?");
		int length = scn.nextInt();
		int[] myArray = new int[length];
		
		for (int i = 0; i < length; i++) {
		myArray[i] = random.nextInt(1, 100);
		}
		
		boolean swapped = false;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - 1; j++) {
				
				int temp = myArray[j];
				if (temp > myArray[j + 1]) {
					myArray[j] = myArray[j + 1];
					myArray[j + 1] = temp;
					swapped = true;
				}
				
			}
			if (swapped == false) {
				break;
			}
		}
		
		for (int i = 0; i < length; i++) {
			System.out.println(myArray[i]);
		}
		
	}

}