import java.util.Scanner;

public class FindValue {

	public static void main(String[] args) {

		int array[] = { 1, 3, 5, 7 };
		Scanner scn = new Scanner(System.in);
		System.out.println("What would you like your guess to be for your array number");
		int num = scn.nextInt();
		boolean found = check(array, num);
		if (found) {
			System.out.println("You found the number!");
			
		}
		if (!found) {
			System.out.println("You did not find the number.");
		}
	}

	public static boolean check(int[] array, int num) {
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) {
				return true;
			}
		}
		return false;
	}
}