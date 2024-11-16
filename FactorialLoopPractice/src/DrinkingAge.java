import java.util.Scanner;

public class DrinkingAge {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("How old are you?");
		Float age = scn.nextFloat();

		if (age < 21) {
			System.out.println("Please leave our bar.");

		} else {
			System.out.println("Come right in!");
		}
		scn.close();
	}
}
