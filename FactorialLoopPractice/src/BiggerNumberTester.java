import java.util.Scanner;
public class BiggerNumberTester {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("What do you want your first number to be?");
		float num1 = scn.nextFloat();
		
		System.out.println("What do you want your second number to be?");
		float num2 = scn.nextFloat();
		
		if (num1>num2) {
			System.out.println("Your number of " + num1 + " is bigger than your other number, " + num2 + " by" + (num1-num2));
		
		}else {
			System.out.println("Your number of " + num2 + " is bigger than your other number, " + num1 + " by" + (num2-num1));
		
		}
		scn.close();
	}

}
