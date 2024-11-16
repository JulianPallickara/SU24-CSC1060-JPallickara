import java.util.Scanner;

public class Powers1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("What do you want your base to be?");
		int base = scn.nextInt();
		System.out.println("What do you want your power to be?");
		int power = scn.nextInt();
	
		int product = 1;
		for (int i = 0; i < power; i++) {
			product *= base;

		}
		System.out.println(product);

	}
}