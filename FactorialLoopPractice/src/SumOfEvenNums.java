import java.util.Scanner;

public class SumOfEvenNums {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("What would you like your number to be?");
		int num = scn.nextInt();

		int numEven = 0;

		for (int i = 0; i <= num; i++) {

			if (i % 2 == 0) {
				numEven = numEven + i;
			}
		}
		
		System.out.println("The sum of even numbrs between 1 and " + num + " is " + numEven);
		scn.close();
	}
}