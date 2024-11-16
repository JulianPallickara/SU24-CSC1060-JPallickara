import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("What would you like your first number to be?");
		int num1 = scn.nextInt();

		System.out.println("What would you like your second number to be?");
		int num2 = scn.nextInt();
		System.out.println("What would you like your third number to be?");
		int num3 = scn.nextInt();
		System.out.println("What would you like your fourth number to be?");
		int num4 = scn.nextInt();
		int[] array = { num1, num2, num3, num4 };

		if ((num1 > num2) && (num1 > num3) && (num1 > num4)) {
			System.out.println("Your largest number was " + num1);
		}
		if ((num2 > num1) && (num2 > num3) && (num2 > num4)) {
			System.out.println("Your largest number was " + num2);
		}
		if ((num3 > num2) && (num3 > num1) && (num3 > num4)) {
			System.out.println("Your largest number was " + num3);
		}
		if ((num4 > num1) && (num4 > num2) && (num4 > num3)) {
			System.out.println("Your largest number was " + num4);
		}
	}
}