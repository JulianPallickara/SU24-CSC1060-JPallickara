import java.util.Scanner;

public class Factorials {

	public static long computeFactorial(int n) {
		long product = 1;
		for (int i = 1; i <= n; i++) {
			product = (product * i);
		}
		return product;
	}

	public static long computePower(int power) {
		long computedValue = 0;
		int base = 3;
		computedValue = (long) Math.pow(base, power);
		return computedValue;

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Put in an integer that you would like to find the factorial for");

		int num = 0;
		try {
			num = scn.nextInt();

		} catch (Exception e) {
			System.out.println("You have not entered a number.");
			System.exit(0);
		}
		int n = num;

		if (n > 15) {
			System.out.println("Your number is too big.");
			System.exit(0);

		}

		long product = computeFactorial(n);
		
		long power = computePower(n);
		
		// while (n > 0) {
		// System.out.println(n);
		// n = n * (n - 1) * (n - 2) * (n - 3) * (n - 4);
		// }

		System.out.println("Your final number is " + product);
		System.out.println("3 raised to the power of " + n + " is " + power);
		
	}
}
