import java.util.Scanner;

public class ArrayMemory {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("How long would you like your array to be?");
		int len = scn.nextInt();
		int array[] = new int[len];

		for (int i = 0; i < array.length; i++) {

			System.out.println("What would like number " + (i + 1) + " to be?");
			int num = scn.nextInt();
			array[i] = num;
		}
		System.out.println("Your numbers are ");
		for (int i = 0; i < array.length; i++) {
			int yournums = array[i];
			System.out.println(yournums);

		}

	}
}