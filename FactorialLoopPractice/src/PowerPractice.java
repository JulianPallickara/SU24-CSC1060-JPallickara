import java.util.Scanner;

public class PowerPractice {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("What would you like your first number to be?");
		int num1 = scn.nextInt();

		System.out.println("What would you like your second number to be?");
		int num2 = scn.nextInt();

		long ans1 = (long) Math.pow(num1, num2);
		long ans2 = (long) Math.pow(num2, num1);
		long finanswer = (long) (ans1-ans2);
		
		System.out.println("Your first number was "+ num1 + " to the power of " + num2 + " with an answer of " + ans1);
		System.out.println("Your second number was "+ num2 + " to the power of3 " + num1 +  "with an answer of " + ans2);

		System.out.println("Your final answeer is " + finanswer);
	}

}