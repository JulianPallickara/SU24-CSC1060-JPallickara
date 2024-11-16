import java.util.Scanner;

public class ThreeNumberCompairer {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("What do you want your first number to be?");
		Float num1 = scn.nextFloat();

		System.out.println("What do you want your second number to be?");
		Float num2 = scn.nextFloat();

		System.out.println("What do you want your third number to be?");
		Float num3 = scn.nextFloat();

		if ((num1 > num2) && (num1 > num3)) {
			System.out.println("Your number of " + num1 + " was the biggest.");
		}
		if ((num2 > num1) && (num2 > num3)) {
			System.out.println("Your number of " + num2 + " was the biggest.");

		}

		if ((num3 > num1) && (num3 > num2)) {
			System.out.println("Your number of " + num3 + " was the biggest.");
		}

		scn.close();
	}

}
