import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("What would you like your number to be?");
		String num = scn.next();

		int length = num.length();
		System.out.println("Number of digits in " + num + " = " + length);

		double fullnum;
		int number;
		
		for (int i = 0; i < length; i++) {
			number = (int) Character.getNumericValue(num.charAt(i) );
			
			System.out.println("Number at (" + i + ") = " + number);
			
			fullnum = Math.pow( number, 3);
			
			System.out.println(fullnum);
		}
	}

}
