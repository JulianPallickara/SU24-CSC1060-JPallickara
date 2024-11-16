import java.util.Scanner;

public class SumEvenAndOdd {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("What would you like your number to be?");

		int kms = scn.nextInt();

		int evenSum = 0;
		int oddSum = 0;

		int sum = 0;
		for (int i = 0; i < kms; i++) {
			if (i % 2 == 0) {
				evenSum = evenSum + i;
			} else {
				oddSum = oddSum + i;
			}

		}
		
		System.out.println("When all of ur odd numbers were added up they added to " + evenSum);
		System.out.println("When all of ur even numbers were added up they added to " + oddSum);

	}
}