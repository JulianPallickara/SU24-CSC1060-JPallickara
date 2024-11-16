import java.util.Scanner;

public class Array1 {

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

		int length = array.length + 1;

		System.out.println("The length of your array is " + length);

		int sum = array[0] + array[1] + array[2] + array[3];

		System.out.println("Your sum of number is " + sum);

		System.out
				.println("Your numbers were " + array[0] + ", " + array[1] + ", " + array[2] + ", " + array[3] + ", ");
	}

}
