import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("What would you like your number to be?");
		int num = scn.nextInt();

		boolean isPrime = true;

		for (int i = 2; i <= num/2; i++) {
			if (num % i == 0) {
				isPrime = false;
				System.out
						.println("Your number of " + num + " was divisible by " + i 
								+ " so it is not a prime number.");

			}
		}
		
		if (isPrime) {
			System.out.println("Your number is a prime number.");
		}

	}

}