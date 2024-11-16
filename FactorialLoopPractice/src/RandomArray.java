import java.util.Random;
import java.util.Scanner;

public class RandomArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("What would you like your array size to be?");
		int len = scn.nextInt();
		Random random = new Random();

		int[] myArray = new int[len];

		for (int i = 0; i < len; i++) {
			myArray[i] = random.nextInt();
		}

		long sum = 0;
		for (int i = 0; i < len; i++) {
			sum += myArray[i];

		}
		double avg = ((double) sum / (double) len);
		System.out.println("Your average is " + avg);
	}
}