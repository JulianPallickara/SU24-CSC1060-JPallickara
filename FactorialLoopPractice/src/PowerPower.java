import java.util.Scanner;

public class PowerPower {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("What would you like your first number to be?");
		int num1 = scn.nextInt();

		System.out.println("What would you like your second number to be?");
		int num2 = scn.nextInt();

		long ans = (long) Math.pow(num1, num2);
		
		System.out.println("Your answer is " + ans);
	}

}