import java.util.Scanner;

public class RightTriangle {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("What would you like your number to be?");
		int num = scn.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);

			}
			System.out.println();

		}
	}
}