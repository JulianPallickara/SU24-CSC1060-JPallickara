import java.util.Scanner;
public class Conditionals1 {
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		System.out.println("This program will test to see if your number is 0, positive or negative."
			+ " insert your number.");
		double num = scn.nextDouble();

		if (num > 0) {
			System.out.println("Your number, " + num + " is positive.");	
		}
	
		if (num == 0) {
			System.out.println("Your number, " + num + " is zero.");
		}

		if (num < 0) {
			System.out.println("Your number, " + num + " is negative");
		
		}
	}
	
	

}
