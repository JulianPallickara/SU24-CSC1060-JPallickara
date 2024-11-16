import java.util.Scanner;

public class Accumulator {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your next number.");

		int num = scn.nextInt();

		int sum = 0;
		while (num != 0) {
			sum += num;
			System.out.println("Enter your next number.");
			num = scn.nextInt();

		}
		System.out.println("The sum of your numbers is " + sum);
	}

}
