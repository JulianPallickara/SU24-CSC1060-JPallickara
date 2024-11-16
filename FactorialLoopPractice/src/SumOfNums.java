import java.util.Scanner;

public class SumOfNums {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("What do you want your number to be?");

		int num = scn.nextInt();
		double sum = 0;

		for (int i = 1; i < num; i++) {
			sum += i;

		}
		System.out.println("Your sum is " + sum);
	}
}