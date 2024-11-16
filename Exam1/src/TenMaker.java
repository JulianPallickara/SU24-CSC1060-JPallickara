import java.util.Scanner;

public class TenMaker {
	public boolean makes10(int num1, int num2) {
		boolean success = false;
		if ((num1 + num2) == 10) {
			success = true;
		}
		if (success == true) {
			System.out.println("Your 2 numbers added up to ten!");

		} else {
			System.out.println("Your numbers did not add up to ten.");
		}
		return success;
	}

	public static void main(String[] args) {
		TenMaker tenMaker = new TenMaker();
		Scanner scn = new Scanner(System.in);
		System.out.println("What would you like your first number to be?");
		int num1 = scn.nextInt();
		System.out.println("What would you like your second number to be?");
		int num2 = scn.nextInt();
		tenMaker.makes10(num1, num2);
	}

}
